package com.wordpress.dojotuba.elementos;

import java.util.Arrays;
import java.util.List;

import com.wordpress.dojotuba.Elemento;

public class Ar extends Elemento {

	public Ar() {
		List<String> vencoDe = Arrays.asList("Agua", "Capeta", "Arma", "Pedra",
				"Fogo");
		super.setVenceDe(vencoDe);
	}
}
