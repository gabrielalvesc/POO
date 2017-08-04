package com.ufpb.questao8;

public abstract class Pessoa {
	
	private String nome;
	private Data nascimento;
	
	public Pessoa(String nome, Data nascimento){
		this.nome = nome;
		this.nascimento = nascimento;
	}
	
	public Pessoa(){
		this.nome = "";
		this.nascimento = null;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNascimento() {
		return this.nascimento.toString();
	}

	public void setNascimento(Data nascimento) {
		this.nascimento = nascimento;
	}
	
	public abstract String imprimeDados();

}
