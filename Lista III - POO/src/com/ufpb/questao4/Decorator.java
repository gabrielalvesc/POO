package com.ufpb.questao4;

public abstract class Decorator implements InterfaceNumeroUm {
	
	protected InterfaceNumeroUm numero;
	
	@Override
	public abstract String imprime();	


}
