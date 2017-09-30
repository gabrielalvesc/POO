package com.ufpb.questao4;

public class Cliente implements SomadorEsperado{
	
	private SomadorEsperado somador;
	
	public Cliente(SomadorEsperado somador){
		this.somador = somador;
	}
	
	public void executar(){
		int [] vetor = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int soma = somador.somaVetor(vetor);
		System.out.println("Soma: "+soma);
	}

	@Override
	public int somaVetor(int[] vetor) {
		int resultado = 0;
		for (int i=0;i<vetor.length;i++){
			resultado+=vetor[i];
		}
		return resultado;
	}

}
