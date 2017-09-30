package com.ufpb.questao4;

public class Main {
	
	public static void main(String[] args) {
		
		SomadorEsperado somador = new Adapter();
		Cliente c = new Cliente(somador);
		c.executar();
		
	}

}
