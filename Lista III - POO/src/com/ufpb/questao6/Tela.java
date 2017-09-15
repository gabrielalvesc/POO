package com.ufpb.questao6;

public class Tela { 
	
	private String descricao;
	private int status;
	
	protected static int UP = 0;
	protected static int DOWN = 1;
	
	public Tela(String descricao){
		this.descricao = descricao;
		this.status = UP;
	}
	
	public void subir() {
		this.status = UP;
		System.out.println(descricao + " subindo....");
	}
 
	public void descer() {
		this.status = DOWN;
		System.out.println(descricao + " descendo....");
	}
 

}
