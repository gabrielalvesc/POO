package com.ufpb.sanduiche;

public class TestLanchonete {
	
	public static void main(String[] args) {
		
		SanduicheStore lanRT = new LanchoneteRT();
		SanduicheStore lanJP = new LanchoneteJP();
		SanduicheStore lanCG = new LanchoneteCG();
		
		lanRT.orderSanduiche();
		lanJP.orderSanduiche();
		lanCG.orderSanduiche();
		
	}

}
