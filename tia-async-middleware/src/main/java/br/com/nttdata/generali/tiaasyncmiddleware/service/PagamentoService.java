package br.com.nttdata.generali.tiaasyncmiddleware.service;



import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.nttdata.generali.tiaasyncmiddleware.dto.PagamentoDto;
import br.com.nttdata.generali.tiaasyncmiddleware.model.Pagamentos;
import br.com.nttdata.generali.tiaasyncmiddleware.model.Status;
import br.com.nttdata.generali.tiaasyncmiddleware.repository.PagamentosRepository;

@Service

public class PagamentoService {
	
	@Autowired(required=true)
	private PagamentosRepository pagamentosRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public Page<PagamentoDto> obterTodos(Pageable paginacao){
		return pagamentosRepository
				.findAll(paginacao)
				.map(p-> modelMapper.map(p, PagamentoDto.class));
	}
	
	public List<Pagamentos> obterTodos2(){
		return pagamentosRepository
				.findAll();
	}
	
	
	public PagamentoDto obterPorId(Long id) {
		Pagamentos pagamento = pagamentosRepository.findById(id)
				.orElseThrow(() -> new EntityNotFoundException());
		
		return modelMapper.map(pagamento, PagamentoDto.class);
	}
	
	public PagamentoDto criaPagamento(PagamentoDto dto) {
		Pagamentos pagamento = modelMapper.map(dto, Pagamentos.class);
		pagamento.setStatus(Status.CRIADO);
		pagamentosRepository.save(pagamento);
		
		return modelMapper.map(pagamento, PagamentoDto.class);
	}
	
	public PagamentoDto atualizarPagamento(Long id, PagamentoDto dto) {
		Pagamentos pagamento = modelMapper.map(dto, Pagamentos.class);
		pagamento.setId(id);
		pagamento.setStatus(Status.CRIADO);
		pagamentosRepository.save(pagamento);
		
		return modelMapper.map(pagamento, PagamentoDto.class);
	}
	
	public void excluirPagamento(Long id) {
		pagamentosRepository.deleteById(id);
	}
}
