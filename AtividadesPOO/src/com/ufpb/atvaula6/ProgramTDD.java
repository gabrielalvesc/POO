package com.ufpb.atvaula6;

import java.util.Scanner;

public class ProgramTDD {
	
	public static void main (String [] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a hora de inicio: ");
		int horaInicio = scan.nextInt();
		while (horaInicio<0 || horaInicio>=24){
			System.out.println("Hora errada!!!\nDigite novamente: ");
			horaInicio = scan.nextInt();
		}
		System.out.println("Digite os minutos de inicio: ");
		int minutosInicio = scan.nextInt();
		while (minutosInicio<0 || minutosInicio>=60){
			System.out.println("Minutos errados!!!\nDigite novamente: ");
			minutosInicio = scan.nextInt();
		}
		System.out.println("Digite a hora de término: ");
		int horaFim = scan.nextInt();
		while (horaFim<0 || horaFim>=24){
			System.out.println("Hora errada!!!\nDigite novamente: ");
			horaFim = scan.nextInt();
		}
		System.out.println("Digite os minutos de término: ");
		int minutosFim = scan.nextInt();
		while (minutosFim<0 || minutosFim>=60){
			System.out.println("Minutos errados!!!\nDigite novamente: ");
			minutosFim = scan.nextInt();
		}
		int horasMinutosInicio = 0;
		for (int i=0; i<horaInicio; i++){
			horasMinutosInicio+=60 ;
		}
		int totalMinInicio = horasMinutosInicio + minutosInicio;
		int horasMinutosFim = 0;
		for (int i=0; i<horaFim; i++){
			horasMinutosFim+=60;
		}
		int totalMinFim = horasMinutosFim + minutosFim;
		int diferenca = 0;
		if (totalMinFim<totalMinInicio){
			diferenca = (1440 - totalMinInicio)+totalMinFim;
		} else {
			diferenca = totalMinFim - totalMinInicio; 
		}
		int horas = diferenca/60;
		int minutos = diferenca%60;
		System.out.printf("Duração: %d:%02d", horas, minutos);				
		scan.close();		
	}
}
