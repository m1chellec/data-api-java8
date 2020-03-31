package br.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Filme {

	
	private String nome;
	private LocalDate lancamento;
	private BigDecimal valor;
	public Filme() {
		super();
	}
	public Filme(String nome, LocalDate lancamento, BigDecimal valor) {
		super();
		this.nome = nome;
		this.lancamento = lancamento;
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getLancamento() {
		return lancamento;
	}
	public void setLancamento(LocalDate lancamento) {
		this.lancamento = lancamento;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	
	
	
	
}
