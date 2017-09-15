package com.ufpb.questao4;

public class Main {
	
	public static void main(String[] args) {
		
		InterfaceNumeroUm n = new NumeroUm();
		n = new ColchetesDecorator(n);
		n = new ParentesesDecorator(n);
		n = new ChavesDecorator(n);
		System.out.println(n.imprime());
	}

}
