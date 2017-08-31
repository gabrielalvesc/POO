package com.ufpb.questao1;

public class Main {
	
	public static void main(String[] args) {
		
		//InsertionSort is = new InsertionSort();
		BubbleSort bs = new BubbleSort();
		
		int lista [] = {4, 2, 7, 10, 5};
		
		for (int i=0; i<lista.length; i++){
			System.out.println(lista[i]);
		}		
		
		int [] listaOrdenada = bs.acao(lista);
		String ordem = "";
		for (int i=0; i<listaOrdenada.length; i++){
			ordem+= lista[i]+" ";
		}
		System.out.println(ordem);
		
		
		
	}

}
