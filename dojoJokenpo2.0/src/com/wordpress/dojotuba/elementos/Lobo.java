package com.wordpress.dojotuba.elementos;

import java.util.Arrays;
import java.util.List;

import com.wordpress.dojotuba.Elemento;

public class Lobo extends Elemento {

	public Lobo() {
		List<String> vencoDe = Arrays.asList("Esponja", "Papel", "Ar", "Agua",
				"Capeta");
		super.setVenceDe(vencoDe);
	}
}
