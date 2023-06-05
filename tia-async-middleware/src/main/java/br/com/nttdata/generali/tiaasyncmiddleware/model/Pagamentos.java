package br.com.nttdata.generali.tiaasyncmiddleware.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pagamento")
public class Pagamentos {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		

		private BigDecimal valor;
		
	
		private String nome;
		
	
		private String numero;
		

		private String expiracao;

		private String codigo;
		
		@Enumerated(EnumType.STRING)
		private Status status;
		
	
		private Long pedidoId;
		
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public BigDecimal getValor() {
			return valor;
		}

		public void setValor(BigDecimal valor) {
			this.valor = valor;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getNumero() {
			return numero;
		}

		public void setNumero(String numero) {
			this.numero = numero;
		}

		public String getExpiracao() {
			return expiracao;
		}

		public void setExpiracao(String expiracao) {
			this.expiracao = expiracao;
		}

		public String getCodigo() {
			return codigo;
		}

		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}

		public Status getStatus() {
			return status;
		}

		public void setStatus(Status status) {
			this.status = status;
		}

		public Long getPedidoId() {
			return pedidoId;
		}

		public void setPedidoId(Long pedidoId) {
			this.pedidoId = pedidoId;
		}

		public Long getFormaDePagamento() {
			return formaDePagamento;
		}

		public void setFormaDePagamento(Long formaDePagamento) {
			this.formaDePagamento = formaDePagamento;
		}

		private Long formaDePagamento;
}
