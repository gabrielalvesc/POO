package com.ufpb.questao1;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestRetangulo {
	
	Retangulo r = new Retangulo();
	double a, b, c;

	@Before
	public void setUp() throws Exception {
		a = 10.0;
		b = 5.0;
		c = 30.0;
	}

	@Test
	public void testCalculaPerimetro() {
		assertEquals(c, r.calculaPerimetro(b, a), 0.1);
	}
	
	@Test
	public void testCalculaArea(){
		assertEquals(50.0, r.calculaArea(b, a), 0.1);
	}

}
