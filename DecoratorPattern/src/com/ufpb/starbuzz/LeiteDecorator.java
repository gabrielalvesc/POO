package com.ufpb.starbuzz;

public class LeiteDecorator extends BebidaDecorator{
	
	public LeiteDecorator (Bebida bebida){
		super.bebida = bebida;
		super.decoratorDescricao = "Leite";
	}

	@Override
	public String getDescricao() {
		return bebida.getDescricao()+" + "+this.decoratorDescricao;
	}

	@Override
	public double getCusto() {
		return bebida.getCusto()+ 2.50;
	}
	
	

}
