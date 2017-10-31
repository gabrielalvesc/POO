package com.ufpb.sanduiche;

public abstract class Sanduiche {
	
	protected String nome;
	protected String pao;
	protected String queijo;
	protected String presunto;
	protected String salada;
	
	public abstract void prepare();
	
	public abstract void bake();
	
	public void box(){
		System.out.println("Embalando o sanduíche "+this.nome+"\n");
	}
	
	

}
