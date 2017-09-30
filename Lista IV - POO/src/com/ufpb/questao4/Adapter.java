package com.ufpb.questao4;

import java.util.ArrayList;
import java.util.List;

public class Adapter implements SomadorEsperado{
	
	private SomadorExistente soma;
	
	public Adapter(){
		this.soma = new SomadorExistente();
	}

	@Override
	public int somaVetor(int[] vetor) {
		List<Integer> lista = new ArrayList<Integer>();
		for (int i: vetor){
			lista.add(i);
		}
		return soma.somaLista(lista);
	}

}
