package com.ufpb.starbuzz;

public class CafeTradicional implements Bebida{

	@Override
	public String getDescricao() {
		return "Café Tradicional";
	}

	@Override
	public double getCusto() {
		return 2;
	}

}
