package com.ufpb.starbuzz;

public class EspumaDecorator extends BebidaDecorator {
	
	public EspumaDecorator(Bebida bebida){
		super.bebida = bebida;
		super.decoratorDescricao = "Espuma";
	}

	@Override
	public String getDescricao() {
		return this.bebida.getDescricao()+" + "+this.decoratorDescricao;
	}

	@Override
	public double getCusto() {
		return this.bebida.getCusto() + 1.50;
	}
	
	

}
