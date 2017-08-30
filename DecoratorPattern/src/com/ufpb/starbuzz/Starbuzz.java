package com.ufpb.starbuzz;

public class Starbuzz {

	public static void main(String[] args) {
		
		Bebida b1 = new CafeTradicional();
		b1 = new LeiteDecorator(b1);
		b1 = new ChocolateDecorator(b1);
		System.out.println("Descrição: "+b1.getDescricao());
		System.out.printf("Custo: %.2f R$\n\n",b1.getCusto());
		
		Bebida b2 = new CafeBlend();
		b2 = new LeiteDecorator(b2);
		b2 = new LeiteDecorator(b2);
		b2 = new EspumaDecorator(b2);
		System.out.println("Descrição: "+b2.getDescricao());
		System.out.printf("Custo: %.2f R$\n\n",b2.getCusto());
		
		Bebida b3 = new CafeDescafeinado();
		b3 = new LeiteDecorator(b3);
		b3 = new ChocolateDecorator(b3);
		b3 = new EspumaDecorator(b3);
		b3 = new CremeDecorator(b3);
		System.out.println("Descrição: "+b3.getDescricao());
		System.out.printf("Custo: %.2f R$\n\n",b3.getCusto());
		
	}

}
