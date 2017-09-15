package com.ufpb.questao3;

public class MainPadaria {

	public static void main(String[] args) {
		
		Bolos b1 = new BoloBaunilha();
		b1 = new CoberturaChocolate(b1);
		b1 = new FrutasAmora(b1);
		b1 = new FrutasMorango(b1);
		System.out.println("Descrição: "+b1.getDescricao());
		System.out.printf("Preço: R$ %.2f",b1.getCusto());
		System.out.println();
		
		Bolos b2 = new BoloChocolate();
		b2 = new CoberturaMorango(b2);
		b2 = new FrutasPessego(b2);
		System.out.println("Descrição: "+b2.getDescricao());
		System.out.printf("Preço: R$ %.2f",b2.getCusto());
		System.out.println();
		
		Bolos b3 = new BoloLimao();
		b3 = new CoberturaDoceDeLeite(b3);
		b3 = new FrutasMorango(b3);
		b3 = new FrutasPessego(b3);
		System.out.println("Descrição: "+b3.getDescricao());
		System.out.printf("Preço: R$ %.2f",b3.getCusto());
		System.out.println();
		

	}

}
