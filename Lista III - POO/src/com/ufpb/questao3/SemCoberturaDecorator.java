package com.ufpb.questao3;

public class SemCoberturaDecorator extends BolosDecorator{
	
	public SemCoberturaDecorator(Bolos bolo){
		super.bolo = bolo;
		super.descricao = "sem cobertura";
	}

	@Override
	public String getDescricao() {
		return this.bolo.getDescricao()+", "+this.descricao;
	}

	@Override
	public double getCusto() {
		return this.bolo.getCusto()	;
	}

}
