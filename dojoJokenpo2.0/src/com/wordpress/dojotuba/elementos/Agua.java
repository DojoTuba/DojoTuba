package com.wordpress.dojotuba.elementos;

import java.util.Arrays;
import java.util.List;

import com.wordpress.dojotuba.Elemento;

public class Agua extends Elemento {

	public Agua() {
		List<String> vencoDe = Arrays.asList("Capeta", "Arma", "Pedra", "Fogo",
				"Tesoura");
		super.setVenceDe(vencoDe);
	}
}
