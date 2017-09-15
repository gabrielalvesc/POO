package com.ufpb.questao4;

public class ColchetesDecorator extends Decorator {
	
	public ColchetesDecorator(InterfaceNumeroUm numero){
		this.numero = numero;
	}

	@Override
	public String imprime() {
		return "["+this.numero.imprime()+"]";
	}

}
