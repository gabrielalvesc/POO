package com.ufpb.questao3;

public class CoberturaChocolate extends BolosDecorator{
	
	public CoberturaChocolate(Bolos bolo){
		super.bolo = bolo;
		super.descricao = "cobertura de Chocolate";
	}

	@Override
	public String getDescricao() {
		return this.bolo.getDescricao()+", "+this.descricao;
	}

	@Override
	public double getCusto() {
		return this.bolo.getCusto() + 1.00;
	}

}
