package com.ufpb.questao3;

import java.util.Scanner;

public class testePoligonos {
	
	public static void main (String [] args){
		
		Scanner scan = new Scanner(System.in);
		Poligono p = new Poligono();
		System.out.println("Qauantos pontos terá o poligono ?");
		int n = scan.nextInt();
		for(int i=0; i<n; i++){
			Coordenadas c = new Coordenadas();
			System.out.println("Digite a coordenada X: ");
			c.setCoordenadaX(scan.nextInt());
			System.out.println("Digite a coordenada Y: ");
			c.setCoordenadaY(scan.nextInt());
			p.adicionaPonto(c);
		}
		System.out.println(p.toString());
		double area = p.calculaArea();
		System.out.println(area);
		scan.close();
	}

}
