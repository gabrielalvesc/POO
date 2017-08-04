package com.ufpb.questao9;

import java.util.List;

public class TestaFormasGeometricas {
	
	public static void main (String [] args){
		
		Vector v = new Vector();
		
		Quadrilateros r1 = new Retangulos(3,2);
		Quadrilateros r2 = new Retangulos(2,4);
		v.adicionaQuadrilateros(r1);
		v.adicionaQuadrilateros(r2);
		
		Quadrilateros q1 = new Quadrados(2);
		Quadrilateros q2 = new Quadrados(3);
		v.adicionaQuadrilateros(q1);
		v.adicionaQuadrilateros(q2);
		
		
		Circulo c1 = new Circulo(2);
		Circulo c2 = new Circulo(3);
		v.adicionaCirculo(c1);
		v.adicionaCirculo(c2);
		
		System.out.println("***** Lados *****");
		int soma = 0;
		List<Quadrilateros> lista = v.getQuadrilateros();
		for (Quadrilateros q: lista){
			
			if (q instanceof Quadrados){
				soma++;
				System.out.println("Q"+soma+": "+q.getLado());
			}
		}
		soma = 0;
		System.out.println("***** Raios *****");
		List<Circulo> listaC = v.getCirculos();
		for (Circulo c: listaC){
			soma++;
			System.out.println("C"+soma+": "+c.getRaio());
		}
		soma = 0;
		int inc = 0;
		System.out.println("***** Perímetros *****");
		for (Quadrilateros q: lista){
			soma++;			
			if (q instanceof Retangulos){
				System.out.println("R"+soma+": "+q.calculaPerimetro());
			} 
			else if (q instanceof Quadrados){
				inc++;
				System.out.println("Q"+inc+": "+q.calculaPerimetro());
			}
		}
		soma=0;
		for (Circulo c: listaC){
			soma++;
			System.out.println("C"+soma+": "+c.calculaPerimetro());
		}
		System.out.println("***** Áreas *****");
		soma=0;
		inc=0;
		for (Quadrilateros q: lista){
			soma++;			
			if (q instanceof Retangulos){
				System.out.println("R"+soma+": "+q.calculaArea());
			} 
			else if (q instanceof Quadrados){
				inc++;
				System.out.println("Q"+inc+": "+q.calculaArea());
			}
		}
		soma=0;
		for (Circulo c: listaC){
			soma++;
			System.out.println("C"+soma+": "+c.calculaArea());
		}
		
	}

}
