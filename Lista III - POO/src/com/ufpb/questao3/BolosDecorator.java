package com.ufpb.questao3;

public abstract class BolosDecorator implements Bolos {
	
	protected String descricao;
	protected Bolos bolo;

	@Override
	public abstract String getDescricao();

	@Override
	public abstract double getCusto();
	
	public String toString(){
		//float nf = "R$ %.2f",this.getCusto(); 
		return "Descrição: "+this.getDescricao()+"\nPreço: %.2f"+this.getCusto();
	}

}
