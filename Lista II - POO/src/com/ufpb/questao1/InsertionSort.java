package com.ufpb.questao1;

public class InsertionSort implements SortStrategy {
	
	@Override
	public int[] acao(int[] lista) {
		int i, j, temp;
		for (j=1; j<lista.length; j++){
			temp = lista[j];
			for (i=j-1; (i>=0) && (lista[i]>temp); i--){
				lista[i+1] = lista[i];
			}
			lista[i+1] = temp;
		}
		return lista;
	}

}
