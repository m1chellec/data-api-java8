package br.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Devolucao {
	private LocalDateTime dataPrevistaDevolucao;
	private LocalDateTime dataRealDevolucao;
	private BigDecimal valorDevolucao;
	
	public Devolucao(LocalDateTime dataPrevistaDevolucao) {
		this.dataPrevistaDevolucao = dataPrevistaDevolucao;

	}

	public LocalDateTime getDataPrevistaDevolucao() {
		return dataPrevistaDevolucao;
	}

	public void setDataPrevistaDevolucao(LocalDateTime dataPrevistaDevolucao) {
		this.dataPrevistaDevolucao = dataPrevistaDevolucao;
	}

	public LocalDateTime getDataRealDevolucao() {
		return dataRealDevolucao;
	}

	public void setDataRealDevolucao(LocalDateTime dataRealDevolucao) {
		this.dataRealDevolucao = dataRealDevolucao;
	}

	public BigDecimal getValorDevolucao() {
		return valorDevolucao;
	}

	public void setValorDevolucao(BigDecimal valorDevolucao) {
		this.valorDevolucao = valorDevolucao;
	}
	
	
	
	
}
