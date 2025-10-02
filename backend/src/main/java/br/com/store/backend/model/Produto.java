package br.com.store.backend.model;

import java.math.BigDecimal;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Produto {
	private UUID id;
	private String nome;
	private Integer qtde;
	private BigDecimal vlrUnitario;
}
