package br.main;

import java.time.format.DateTimeFormatter;

import br.repository.FilmesRepo;

public class Main {
	
	public static void main(String[] args) {
			System.out.printf("%-30s %s\n", "Nome: " , "Data de Lançamento: ");
			
			FilmesRepo filmes = new FilmesRepo();
			filmes.todos().forEach(f -> {
				System.out.printf("%-30s %s\n", f.getNome(), f.getLancamento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
				
				
			});
			
	}

}
