package com.wordpress.dojotuba.elementos;

import java.util.Arrays;
import java.util.List;

import com.wordpress.dojotuba.Elemento;

public class Fogo extends Elemento {

	public Fogo() {
		List<String> vencoDe = Arrays.asList("Tesoura", "Humano", "Lobo",
				"Esponja", "Papel");
		super.setVenceDe(vencoDe);
	}

}
