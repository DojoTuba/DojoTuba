package com.wordpress.dojotuba;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.wordpress.dojotuba.Jokenpo;
import com.wordpress.dojotuba.elementos.*;

public class JokenpoTest {

	Jokenpo jokenpo;

	@Before
	public void setUp() {
		jokenpo = new Jokenpo();
	}

	@Test
	public void pedra_empata_com_pedra() {
		jokenpo.setOpcao1(new Pedra());
		jokenpo.setOpcao2(new Pedra());
		assertEquals("Empate", jokenpo.resultadoPartida());
	}
	
	@Test
	public void fogo_empata_com_fogo() {
		jokenpo.setOpcao1(new Fogo());
		jokenpo.setOpcao2(new Fogo());
		assertEquals("Empate", jokenpo.resultadoPartida());
	}
	
	@Test
	public void ar_empata_com_ar() {
		jokenpo.setOpcao1(new Ar());
		jokenpo.setOpcao2(new Ar());
		assertEquals("Empate", jokenpo.resultadoPartida());
	}
	
	@Test
	public void agua_ganha_de_capeta() {
		jokenpo.setOpcao1(new Agua());
		jokenpo.setOpcao2(new Capeta());
		assertEquals("Agua", jokenpo.resultadoPartida());
	}
	
	@Test
	public void agua_ganha_de_arma() {
		jokenpo.setOpcao1(new Agua());
		jokenpo.setOpcao2(new Arma());
		assertEquals("Agua", jokenpo.resultadoPartida());
	}
	
	@Test
	public void agua_ganha_de_pedra() {
		jokenpo.setOpcao1(new Agua());
		jokenpo.setOpcao2(new Pedra());
		assertEquals("Agua", jokenpo.resultadoPartida());
	}
	
	@Test
	public void agua_ganha_de_fogo() {
		jokenpo.setOpcao1(new Agua());
		jokenpo.setOpcao2(new Fogo());
		assertEquals("Agua", jokenpo.resultadoPartida());
	}
	
	@Test
	public void agua_ganha_de_tesoura() {
		jokenpo.setOpcao1(new Agua());
		jokenpo.setOpcao2(new Tesoura());
		assertEquals("Agua", jokenpo.resultadoPartida());
	}
	
	@Test
	public void ar_ganha_de_agua() {
		jokenpo.setOpcao1(new Ar());
		jokenpo.setOpcao2(new Agua());
		assertEquals("Ar", jokenpo.resultadoPartida());
	}
	
	@Test
	public void ar_ganha_de_capeta() {
		jokenpo.setOpcao1(new Ar());
		jokenpo.setOpcao2(new Capeta());
		assertEquals("Ar", jokenpo.resultadoPartida());
	}
	
	@Test
	public void ar_ganha_de_arma() {
		jokenpo.setOpcao1(new Ar());
		jokenpo.setOpcao2(new Arma());
		assertEquals("Ar", jokenpo.resultadoPartida());
	}
	
	@Test
	public void ar_ganha_de_pedra() {
		jokenpo.setOpcao1(new Ar());
		jokenpo.setOpcao2(new Pedra());
		assertEquals("Ar", jokenpo.resultadoPartida());
	}
	
	@Test
	public void ar_ganha_de_fogo() {
		jokenpo.setOpcao1(new Ar());
		jokenpo.setOpcao2(new Fogo());
		assertEquals("Ar", jokenpo.resultadoPartida());
	}

	@Test
	public void arma_ganha_de_pedra() {
		jokenpo.setOpcao1(new Arma());
		jokenpo.setOpcao2(new Pedra());
		assertEquals("Arma", jokenpo.resultadoPartida());
	}

	@Test
	public void arma_ganha_de_fogo() {
		jokenpo.setOpcao1(new Arma());
		jokenpo.setOpcao2(new Fogo());
		assertEquals("Arma", jokenpo.resultadoPartida());
	}

	@Test
	public void arma_ganha_de_tesoura() {
		jokenpo.setOpcao1(new Arma());
		jokenpo.setOpcao2(new Tesoura());
		assertEquals("Arma", jokenpo.resultadoPartida());
	}

	@Test
	public void arma_ganha_de_humano() {
		jokenpo.setOpcao1(new Arma());
		jokenpo.setOpcao2(new Humano());
		assertEquals("Arma", jokenpo.resultadoPartida());
	}

	@Test
	public void arma_ganha_de_lobo() {
		jokenpo.setOpcao1(new Arma());
		jokenpo.setOpcao2(new Lobo());
		assertEquals("Arma", jokenpo.resultadoPartida());
	}

	@Test
	public void capeta_ganha_de_humano() {
		jokenpo.setOpcao1(new Capeta());
		jokenpo.setOpcao2(new Humano());
		assertEquals("Capeta", jokenpo.resultadoPartida());
	}

	@Test
	public void esponja_ganha_de_agua() {
		jokenpo.setOpcao1(new Esponja());
		jokenpo.setOpcao2(new Agua());
		assertEquals("Esponja", jokenpo.resultadoPartida());
	}

	@Test
	public void fogo_ganha_de_tesoura() {
		jokenpo.setOpcao1(new Fogo());
		jokenpo.setOpcao2(new Tesoura());
		assertEquals("Fogo", jokenpo.resultadoPartida());
	}

	@Test
	public void humano_ganha_de_lobo() {
		jokenpo.setOpcao1(new Humano());
		jokenpo.setOpcao2(new Lobo());
		assertEquals("Humano", jokenpo.resultadoPartida());
	}

	@Test
	public void lobo_ganha_de_papel() {
		jokenpo.setOpcao1(new Lobo());
		jokenpo.setOpcao2(new Agua());
		assertEquals("Lobo", jokenpo.resultadoPartida());
	}
	
	@Test
	public void pedra_ganha_de_tesoura() {
		jokenpo.setOpcao1(new Pedra());
		jokenpo.setOpcao2(new Tesoura());
		assertEquals("Pedra", jokenpo.resultadoPartida());
	}

	@Test
	public void tesoura_ganha_de_papel() {
		jokenpo.setOpcao1(new Tesoura());
		jokenpo.setOpcao2(new Papel());
		assertEquals("Tesoura", jokenpo.resultadoPartida());
	}

	@Test
	public void papel_ganha_de_pedra() {
		jokenpo.setOpcao1(new Papel());
		jokenpo.setOpcao2(new Pedra());
		assertEquals("Papel", jokenpo.resultadoPartida());
	}

	@Test
	public void tesoura_perde_de_pedra() {
		jokenpo.setOpcao1(new Tesoura());
		jokenpo.setOpcao2(new Pedra());
		assertEquals("Pedra", jokenpo.resultadoPartida());
	}

	@Test
	public void pedra_perde_de_papel() {
		jokenpo.setOpcao1(new Pedra());
		jokenpo.setOpcao2(new Papel());
		assertEquals("Papel", jokenpo.resultadoPartida());
	}

	@Test
	public void papel_perde_de_tesoura() {
		jokenpo.setOpcao1(new Papel());
		jokenpo.setOpcao2(new Tesoura());
		assertEquals("Tesoura", jokenpo.resultadoPartida());
	}
	
	@Test
	public void papel_perde_de_esponja() {
		jokenpo.setOpcao1(new Papel());
		jokenpo.setOpcao2(new Esponja());
		assertEquals("Esponja", jokenpo.resultadoPartida());
	}
	@Test
	public void papel_perde_de_lobo() {
		jokenpo.setOpcao1(new Papel());
		jokenpo.setOpcao2(new Lobo());
		assertEquals("Lobo", jokenpo.resultadoPartida());
	}
	@Test
	public void papel_perde_de_humano() {
		jokenpo.setOpcao1(new Papel());
		jokenpo.setOpcao2(new Humano());
		assertEquals("Humano", jokenpo.resultadoPartida());
	}
	@Test
	public void papel_perde_de_fogo() {
		jokenpo.setOpcao1(new Papel());
		jokenpo.setOpcao2(new Fogo());
		assertEquals("Fogo", jokenpo.resultadoPartida());
	}
	

}