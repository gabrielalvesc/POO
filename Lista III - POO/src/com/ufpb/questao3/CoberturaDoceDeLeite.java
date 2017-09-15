package com.ufpb.questao3;

public class CoberturaDoceDeLeite extends BolosDecorator {
	
	public CoberturaDoceDeLeite (Bolos bolo){
		super.bolo = bolo;
		super.descricao = "cobertura de Doce de Leite";
	}

	@Override
	public String getDescricao() {
		return this.bolo.getDescricao()+", "+this.descricao;
	}

	@Override
	public double getCusto() {
		return this.bolo.getCusto() + 1.50;
	}

}
