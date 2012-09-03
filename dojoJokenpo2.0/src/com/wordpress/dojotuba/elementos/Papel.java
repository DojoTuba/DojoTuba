package com.wordpress.dojotuba.elementos;

import java.util.Arrays;
import java.util.List;

import com.wordpress.dojotuba.Elemento;

public class Papel extends Elemento {

	public Papel() {
		List<String> vencoDe = Arrays.asList("Ar", "Agua", "Capeta", "Arma",
				"Pedra");
		super.setVenceDe(vencoDe);
	}
}
