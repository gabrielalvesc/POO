package com.ufpb.questao3;

public class FrutasPessego extends BolosDecorator {
	
	public FrutasPessego(Bolos bolo){
		super.bolo = bolo;
		super.descricao = "com Pessêgos";
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