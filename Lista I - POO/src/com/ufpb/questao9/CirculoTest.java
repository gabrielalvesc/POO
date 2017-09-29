package com.ufpb.questao9;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CirculoTest {
	
	double raio;
	Circulo c;

	@Before
	public void setUp() throws Exception {
		raio = 2;
		c = new Circulo(raio);
	}

	@Test
	public void testCalculaArea() {
		assertEquals(12.56, c.calculaArea(), 0.1);
	}
	
	@Test
	public void testCalculaPerimetro(){
		assertEquals(12.56, c.calculaPerimetro(), 0.1);
	}

}
