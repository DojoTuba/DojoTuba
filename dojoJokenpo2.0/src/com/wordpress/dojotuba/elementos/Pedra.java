package com.wordpress.dojotuba.elementos;

import java.util.Arrays;
import java.util.List;

import com.wordpress.dojotuba.Elemento;

public class Pedra extends Elemento {

	public Pedra() {
		List<String> vencoDe = Arrays.asList("Fogo", "Tesoura", "Humano",
				"Lobo", "Esponja");
		super.setVenceDe(vencoDe);
	}
}
