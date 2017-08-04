package com.ufpb.questao8;

public class Cliente extends Pessoa {
	
	private int codigo;
	

	
	
	public Cliente(String nome, Data nascimento, int codigo) {
		super(nome, nascimento);
		this.codigo = codigo;
	}


	public Cliente(){
		this.codigo = 0;
	}
	
	public int getCodigo(){
		return this.codigo;
	}
	
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}
	
	public String imprimeDados(){
		return "Nome: "+this.getNome()+"\n"+"Nascimento: "+this.getNascimento().toString()+"\n"+"Código: "+this.codigo;
	}


}
