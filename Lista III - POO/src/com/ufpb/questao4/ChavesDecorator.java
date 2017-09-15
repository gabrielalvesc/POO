package com.ufpb.questao4;

public class ChavesDecorator extends Decorator {
	
	public ChavesDecorator(InterfaceNumeroUm numero){
		super.numero = numero;
	}

	@Override
	public String imprime() {
		return "{"+this.numero.imprime()+"}";
	}

}
