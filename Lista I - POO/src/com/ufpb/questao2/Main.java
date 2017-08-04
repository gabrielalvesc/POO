package com.ufpb.questao2;

import java.util.Scanner;

public class Main {
	
	public static void main (String [] args){
		
		Scanner scan = new Scanner (System.in);
		Pessoa p = new Pessoa();
		System.out.println("Nome: ");
		p.setNome(scan.nextLine().toUpperCase());
		System.out.println("Idade: ");
		p.setIdade(scan.nextInt());
		System.out.println("Sexo: ");
		p.setSexo(scan.nextLine().toUpperCase());
		System.out.println("Peso: ");
		p.setPeso(scan.nextDouble());
		System.out.println("Altura: ");
		p.setAltura(scan.nextDouble());
		System.out.println(p.toString());
		scan.close();
	}

}
