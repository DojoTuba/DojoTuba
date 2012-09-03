package com.wordpress.dojotuba.elementos;

import java.util.Arrays;
import java.util.List;

import com.wordpress.dojotuba.Elemento;

public class Esponja extends Elemento {

	public Esponja() {
		List<String> vencoDe = Arrays.asList("Papel", "Ar", "Agua", "Demo",
				"Arma");
		super.setVenceDe(vencoDe);
	}
}
