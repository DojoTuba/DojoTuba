package com.wordpress.dojotuba.elementos;

import java.util.Arrays;
import java.util.List;

import com.wordpress.dojotuba.Elemento;

public class Humano extends Elemento {

	public Humano() {
		List<String> vencoDe = Arrays.asList("Lobo", "Esponja", "Papel", "Ar",
				"Agua");
		super.setVenceDe(vencoDe);
	}
}
