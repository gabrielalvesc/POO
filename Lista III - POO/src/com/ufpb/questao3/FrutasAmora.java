package com.ufpb.questao3;

public class FrutasAmora extends BolosDecorator {
	
	public FrutasAmora (Bolos bolo){
		super.bolo = bolo;
		super.descricao = "com Amoras";
	}

	@Override
	public String getDescricao() {
		return this.bolo.getDescricao()+", "+this.descricao;
	}

	@Override
	public double getCusto() {
		return this.bolo.getCusto()+2.00;
	}
	

}
