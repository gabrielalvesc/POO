package com.ufpb.questao3;

public class CoberturaMorango extends BolosDecorator{
	
	public CoberturaMorango(Bolos bolo){
		super.bolo = bolo;
		super.descricao = "cobertura de Morango";
	}

	@Override
	public String getDescricao() {
		return this.bolo.getDescricao()+", "+this.descricao;
	}

	@Override
	public double getCusto() {
		return this.bolo.getCusto()+1.00;
	}

}
