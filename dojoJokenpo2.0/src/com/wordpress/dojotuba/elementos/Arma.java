package com.wordpress.dojotuba.elementos;

import java.util.Arrays;
import java.util.List;

import com.wordpress.dojotuba.Elemento;

public class Arma extends Elemento {

	public Arma() {
		List<String> vencoDe = Arrays.asList("Pedra", "Fogo", "Tesoura",
				"Humano", "Lobo");
		super.setVenceDe(vencoDe);
	}
}
