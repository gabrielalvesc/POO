package com.ufpb.questao2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PessoaTest {
	
	Pessoa p = new Pessoa();
	double a, b;

	@Before
	public void setUp() throws Exception {
		a = 70.0;
		b = 1.90;
	}

	@Test
	public void testImc() {
		assertEquals(19.39, p.calculaImc(a, b), 0.1);
	}

}
