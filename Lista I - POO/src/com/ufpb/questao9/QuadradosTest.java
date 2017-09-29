package com.ufpb.questao9;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class QuadradosTest {
	
	double l;
	Quadrados q;

	@Before
	public void setUp() throws Exception {
		l = 2;
		q = new Quadrados(l);
	}

	@Test
	public void testCalculaArea() {
		assertEquals(4, q.calculaArea(), 0.1);
	}
	
	@Test
	public void testCalculaPerimetro(){
		assertEquals(8, q.calculaPerimetro(), 0.1);
	}

}
