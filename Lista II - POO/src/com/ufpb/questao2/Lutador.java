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
		if (life <= 0){
			this.life = 0;
		} else if (life >= 100) {
			this.life = 100;
		} else {
			this.life = life;
		}
	}
	
	public void atacar(Lutador l){
		l.setLife(l.getLife() + (this.ataque.atacar()+l.defesa.defender()));
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
	
	public String toString(){
		return "Gurreiro: "+this.nome+"\n"+"Life: "+this.life;
	}

}
