package br.main;

import java.util.Arrays;
import java.util.List;

import br.model.Cliente;
import br.model.Filme;
import br.model.Locacao;
import br.repository.FilmesRepo;

public class NovaLocacao {

	
	public static void main(String[] args) {
		FilmesRepo filmes = new FilmesRepo();
		List<Filme> filmesAlugados = Arrays.asList(filmes.porCodigo(0));
		Locacao locacao = new Locacao(filmesAlugados, new Cliente ("Joao Souza"));
		locacao.imprimirRecibo();		
	}
}
