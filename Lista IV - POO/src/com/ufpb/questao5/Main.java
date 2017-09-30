package com.ufpb.questao5;

public class Main {
	
	public static void main(String[] args) {
		
		MedidorCelsiusIF adapter = new Adapter();
		MedidorCelsiusIF classAdapter = new ClassAdapter();
		System.out.println(adapter.medirTemperatura());
		System.out.println(classAdapter.medirTemperatura());
		
	}

}
