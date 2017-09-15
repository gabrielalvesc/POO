package com.ufpb.questao3;

public class SemFrutas extends BolosDecorator {
	
	public SemFrutas (Bolos bolo){
		super.bolo = bolo;
		super.descricao = "sem frutas";
	}

	@Override
	public String getDescricao() {
		return this.bolo.getDescricao()+", "+this.descricao;
	}

	@Override
	public double getCusto() {
		return this.bolo.getCusto();
	}

}
