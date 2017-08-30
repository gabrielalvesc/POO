package com.ufpb.starbuzz;

public abstract class BebidaDecorator implements Bebida {
	
	protected String decoratorDescricao;
	protected Bebida bebida;
	
	@Override
	public abstract String getDescricao();

	@Override
	public abstract double getCusto();

}
