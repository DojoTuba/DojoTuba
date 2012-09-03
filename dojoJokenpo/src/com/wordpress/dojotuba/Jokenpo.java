package com.wordpress.dojotuba;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author henrique
 * @author levi
 * @author jomaro
 * @author felipe
 * @author patrick
 * @author rafael
 * @author carlos henrique
 * 
 */
public class Jokenpo {

	public String decideResultado(String jogador1, String jogador2) {
		if (jogador1 == jogador2)
			return "Empate";

		if (!verificaValorValido(jogador1) || !verificaValorValido(jogador2))
			return "Valor invalido";

		if (jogador1 == "Pedra" && jogador2 == "Papel")
			return "Papel";

		if (jogador1 == "Papel" && jogador2 == "Tesoura")
			return "Tesoura";

		if (jogador1 == "Tesoura" && jogador2 == "Pedra")
			return "Pedra";

		return jogador1;
	}
	
	public boolean verificaValorValido(String jogador){
		List<String> valoresValidos = new ArrayList<String>(Arrays.asList("Pedra", "Papel", "Tesoura"));

		return valoresValidos.contains(jogador);
	}

}