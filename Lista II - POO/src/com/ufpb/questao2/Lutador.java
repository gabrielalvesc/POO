package com.ufpb.questao2;

public class Lutador {
	
	private String nome;
	private int life;
	private Ataque ataque;
	private Defesa defesa;
	
	public Lutador(String nome, Ataque ataque, Defesa defesa){
		this.nome = nome;
		this.life = 100;
		this.ataque = ataque;
		this.defesa = defesa;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}
	
	public void atacar(Lutador l){
		l.setLife(l.getLife() + this.ataque.atacar());
	}
	
	public void defender(){
		this.setLife(this.getLife() + this.defesa.defender());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Defesa defesa(){
		return this.defesa;
	}
	
	

}
