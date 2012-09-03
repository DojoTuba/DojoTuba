package com.wordpress.dojotuba.elementos;

import java.util.Arrays;
import java.util.List;

import com.wordpress.dojotuba.Elemento;

public class Capeta extends Elemento {

	public Capeta() {
		List<String> vencoDe = Arrays.asList("Arma", "Pedra", "Fogo",
				"Tesoura", "Humano");
		super.setVenceDe(vencoDe);
	}
}
