package com.ufpb.starbuzz;

public class ChocolateDecorator extends BebidaDecorator{
	
	public ChocolateDecorator(Bebida bebida){
		super.bebida = bebida;
		super.decoratorDescricao = "Chocolate";
	}

	@Override
	public String getDescricao() {
		return this.bebida.getDescricao()+" + "+this.decoratorDescricao;
	}

	@Override
	public double getCusto() {
		return this.bebida.getCusto() + 3;
	}
	
	
}
