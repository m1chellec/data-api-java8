package br.repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import br.model.Filme;

public class FilmesRepo {

	private static Filme[] filmes = { new Filme("Jogos Vorazes", LocalDate.of(2014, Month.APRIL, 3), new BigDecimal(5)),
			new Filme("O chamado", LocalDate.of(2010, Month.MARCH, 6), new BigDecimal(5)),
			new Filme("Ultimato ", LocalDate.of(2018, Month.DECEMBER, 13), new BigDecimal(5)),
			new Filme("12 anos  ", LocalDate.of(2014, Month.FEBRUARY, 28), new BigDecimal(5)),
			new Filme("Joker ", LocalDate.of(2019, Month.NOVEMBER, 20), new BigDecimal(5))

	};

	public List<Filme> todos() {

		return Arrays.asList(filmes);
	}

	public Filme porCodigo(int codigo) {
		return filmes[codigo];
	}
}
