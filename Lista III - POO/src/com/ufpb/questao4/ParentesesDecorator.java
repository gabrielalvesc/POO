package com.ufpb.questao4;

public class ParentesesDecorator extends Decorator {
	
	public ParentesesDecorator(InterfaceNumeroUm numero){
		super.numero = numero;
	}

	@Override
	public String imprime() {
		return "("+this.numero.imprime()+")";
	}

}
