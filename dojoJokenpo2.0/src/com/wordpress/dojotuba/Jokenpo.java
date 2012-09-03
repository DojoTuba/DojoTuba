package com.wordpress.dojotuba;

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

	private Elemento opcao1;
	private Elemento opcao2;

	public String resultadoPartida() {
		if (opcao1.getClass() == opcao2.getClass())
			return "Empate";
		
		if (opcao1.venceDe(opcao2))
			return opcao1.toString();
		
		return opcao2.toString();
	}
	
	public Elemento getOpcao1() {
		return opcao1;
	}

	public void setOpcao1(Elemento opcao1) {
		this.opcao1 = opcao1;
	}

	public Elemento getOpcao2() {
		return opcao2;
	}

	public void setOpcao2(Elemento opcao2) {
		this.opcao2 = opcao2;
	}
}