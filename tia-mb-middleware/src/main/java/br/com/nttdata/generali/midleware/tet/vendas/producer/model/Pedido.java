package br.com.nttdata.generali.midleware.tet.vendas.producer.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "pedidos")
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {

		@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@NotNull
		private LocalDateTime dataHora;
		
		@NotNull @Enumerated(EnumType.STRING)
		private Status status;
		
		@OneToMany(cascade = CascadeType.PERSIST, mappedBy ="pedido")
		private List<ItemDoPedido> itens = new ArrayList<>();

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public LocalDateTime getDataHora() {
			return dataHora;
		}

		public void setDataHora(LocalDateTime dataHora) {
			this.dataHora = dataHora;
		}

		public Status getStatus() {
			return status;
		}

		public void setStatus(Status status) {
			this.status = status;
		}

		public List<ItemDoPedido> getItens() {
			return itens;
		}

		public void setItens(List<ItemDoPedido> itens) {
			this.itens = itens;
		}
		
		
}
