package com.ufpb.sanduiche;

public abstract class SanduicheStore { 
	
	public Sanduiche orderSanduiche(){
		Sanduiche s = createSanduiche();
		s.prepare();
		s.bake();
		s.box();
		return s;
	}
	
	protected abstract Sanduiche createSanduiche();

}
