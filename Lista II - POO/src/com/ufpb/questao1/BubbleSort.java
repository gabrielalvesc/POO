package com.ufpb.questao1;

public class BubbleSort implements SortStrategy {

	@Override
	public int[] acao(int[] lista) {
		int temp = 0;
		for (int i=0; i<lista.length; i++){
			for (int k=0; k<lista.length -1; k++){
				if (lista[k]>lista[k+1]){
					temp = lista[k];
					lista[k] = lista[k+1];
					lista[k+1] = temp;
				}
			}
		}
		return lista;
	}

}
