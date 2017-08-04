package com.ufpb.questao4;

import java.util.Scanner;

public class TesteBits {
	
	public static void main (String [] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o tamanho dos Arrays: ");
		int quant = scan.nextInt();
		Bits b1 = new Bits(quant);
		System.out.println("Digite "+quant+" bits para o array 1");
		for (int i=0;i<quant;i++){
			System.out.println("Digite o bit: [0/1]");
			int n = scan.nextInt();
			if (n==1){
				b1.modificarBit(i, true, quant);
			} else if (n==0){
				b1.modificarBit(i, false, quant);
			}
		}
		
		Bits b2 = new Bits(quant);
		System.out.println("Digite "+quant+" bits para o array 2");
		for (int i=0;i<quant;i++){
			System.out.println("Digite o bit: [0/1]");
			int n = scan.nextInt();
			if (n==1){
				b2.modificarBit(i, true, quant);
			} else if (n==0){
				b2.modificarBit(i, false, quant);
			}
		}
		
		boolean [] and = b1.and(b2.getBits(), quant);
		String strand = "";
		for (int i=0; i<quant; i++){
			if (and[i]==true){
				strand+="1 ";
			} else {
				strand+="0 ";
			}
		}
		System.out.println("O resultado do AND entre os bits do array 1 e os bits do array 2 foi: "+strand);
		
		boolean [] or = b1.or(b2.getBits(), quant);
		String stror = ""; 
		for (int i=0; i<quant; i++){
			if (or[i]==true){
				stror+="1 ";
			} else {
				stror+="0 ";
			}
		}
		System.out.println("O resultado do OR entre os bits do array 1 e os bits do array 2 foi: "+stror);
		
		boolean [] notl1 = b1.not(quant);
		boolean [] notl2 = b2.not(quant);
		String strnotl1 = "";
		String strnotl2 = "";
		for (int i=0; i<quant; i++){
			if (notl1[i]==true){
				strnotl1+="1 ";
			} else {
				strnotl1+="0 ";
			}
		}
		for (int i=0; i<quant; i++){
			if (notl2[i]==true){
				strnotl2+="1 ";
			} else {
				strnotl2+="0 ";
			}
		}
		System.out.println("O resultado do NOT dos bits do array 1 foi: "+strnotl1);
		System.out.println("O resultado do NOT dos bits do array 2 foi: "+strnotl2);
		
		scan.close();
	}

}
