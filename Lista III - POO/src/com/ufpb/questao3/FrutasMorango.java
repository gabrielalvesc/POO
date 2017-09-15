package com.ufpb.questao3;

public class FrutasMorango extends BolosDecorator{
	
	public FrutasMorango(Bolos bolo){
		super.bolo = bolo;
		super.descricao = "com Morangos";
	}

	@Override
	public String getDescricao() {
		return this.bolo.getDescricao()+", "+this.descricao;
	}

	@Override
	public double getCusto() {
		return this.bolo.getCusto()+1.50;
	}

}
