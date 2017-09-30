package com.ufpb.questao2;

public class Incremental implements Runnable{
	
	private static int count = 0;
	private int numero;
	private static Incremental uniqueInstance;
	
	private Incremental(){
		this.numero = ++count;
	}
	
	public static Incremental getInstance(){
		if (uniqueInstance==null){
			uniqueInstance = new Incremental();
		}
		return uniqueInstance;
	}
	
	@Override
	public String toString(){
		return "Incremental "+this.numero;
	}

	@Override
	public void run() {
		for (int i=0; i<10; i++){
			System.out.println(this.toString());
		}
		
	}

}
