package com.wordpress.dojotuba;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.wordpress.dojotuba.Jokenpo;

public class JokenpoTest {

	Jokenpo jokenpo;

	@Before
	public void setup() {
		jokenpo = new Jokenpo();
	}

	@Test
	public void pedra_ganha_de_tesoura() {
		assertEquals("Pedra", jokenpo.decideResultado("Pedra", "Tesoura"));
	}

	@Test
	public void pedra_perde_de_papel() {
		assertEquals("Papel" ,jokenpo.decideResultado("Pedra", "Papel"));
	}

	@Test
	public void papel_perde_de_tesoura() {
		assertEquals("Tesoura", jokenpo.decideResultado("Papel", "Tesoura"));
	}

	@Test
	public void papel_ganha_pedra() {
		assertEquals("Papel", jokenpo.decideResultado("Papel", "Pedra"));
	}

	@Test
	public void tesoura_empata_tesoura() {
		assertEquals("Empate", jokenpo.decideResultado("Tesoura", "Tesoura"));
	}

	@Test
	public void tesoura_perde_de_pedra() {
		assertEquals("Pedra", jokenpo.decideResultado("Tesoura", "Pedra"));
	}

	@Test
	public void valor_invalido() {
		assertEquals("Valor invalido", jokenpo.decideResultado("Ar", "Terra"));
	}

	@Test
	public void valor1_invalido() {
		assertEquals("Valor invalido", jokenpo.decideResultado("Ar", "Pedra"));
	}

	@Test
	public void tesoura_ganha_de_papel() {
		assertEquals("Tesoura", jokenpo.decideResultado("Tesoura", "Papel"));
	}
}