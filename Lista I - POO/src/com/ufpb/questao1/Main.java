package com.ufpb.questao1;

import java.util.Scanner;

public class Main {
	
	public static void main (String [] args){
		
		Scanner scan = new Scanner(System.in);
		Retangulo r1 = new Retangulo();
		System.out.println("Altura: ");
		Double altura = scan.nextDouble();
		r1.setAltura(altura);
		System.out.println("Largura: ");
		Double largura = scan.nextDouble();
		r1.setLargura(largura);
		System.out.println(r1.toString()+"\nPerí­metro: "+r1.calculaPerimetro(altura, largura)+"\nÁrea: "+r1.calculaArea(altura, largura)+"\n");
		Retangulo r2 = new Retangulo(2.0, 5.5);
		Double area = r2.calculaArea(2.0, 5.5);
		Double perimetro = r2.calculaPerimetro(2.0, 5.5);
		System.out.println(r2.toString()+"\nPerí­metro: "+perimetro+"\nÁrea: "+area+"\n");
		boolean igual = r1.equals(r2);
		if(igual == true){
			System.out.println("São iguais!!!");
		} else {
			System.out.println("Não são iguais!!!");
		}
		scan.close();
	}

}
