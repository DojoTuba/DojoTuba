package com.wordpress.dojotuba.elementos;

import java.util.Arrays;
import java.util.List;

import com.wordpress.dojotuba.Elemento;

public class Tesoura extends Elemento {

	public Tesoura() {
		List<String> vencoDe = Arrays.asList("Humano", "Lobo", "Esponja",
				"Papel", "Ar");
		super.setVenceDe(vencoDe);
	}

}
