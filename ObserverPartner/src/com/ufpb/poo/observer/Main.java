package com.ufpb.poo.observer;

public class Main {
	
	public static void main (String [] args){
		
		Pessoa a1 = new Pessoa();
		a1.setNome("Gabriel");
		a1.setCpf("123456789-12");
		Pessoa a2 = new Pessoa();
		a2.setNome("Douglas");
		a2.setCpf("098765432-10");
		Pessoa a3 = new Pessoa();
		a3.setNome("Kewyn");
		a3.setCpf("678901234-56");
		Pessoa a4 = new Pessoa();
		a4.setNome("Danilo");
		a4.setCpf("765498376-09");
		
		Editora editora = new Editora();
		
		editora.registerObserver(a1);
		editora.registerObserver(a2);
		editora.registerObserver(a3);		
		editora.notifyObservers("VEJA");
		System.out.println();
		editora.registerObserver(a4);
		editora.notifyObservers("O GLOBO");
		System.out.println();
		editora.removeObserver(a3);
		editora.notifyObservers("CARTA CAPITAL");
		
		System.out.println();
		System.out.println("***** Assinantes *****");
		for (Observer o: editora.getObservers()) {
			System.out.println(o.toString());
		}
		
		for (String s: a3.getRevistas()){
			System.out.println(s);
		}
		
		
		
	}

}
