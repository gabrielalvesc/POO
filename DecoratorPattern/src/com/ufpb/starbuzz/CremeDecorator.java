package com.ufpb.starbuzz;

public class CremeDecorator extends BebidaDecorator{
	
	public CremeDecorator(Bebida bebida){
		super.bebida = bebida;
		super.decoratorDescricao = "Creme";
	}

	@Override
	public String getDescricao() {
		return this.bebida.getDescricao()+" + "+this.decoratorDescricao;
	}

	@Override
	public double getCusto() {
		return this.bebida.getCusto() + 2;
	}

}
