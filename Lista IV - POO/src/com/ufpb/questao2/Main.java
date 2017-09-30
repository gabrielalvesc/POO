package com.ufpb.questao2;

public class Main {
	
	public static void main(String[] args) {
		
		
			Incremental inc = Incremental.getInstance();
			Incremental inc2 = Incremental.getInstance();
			Incremental inc3 = Incremental.getInstance();
			Incremental inc4 = Incremental.getInstance();
			Thread t1 = new Thread(inc);
			Thread t2 = new Thread(inc2);
			Thread t3 = new Thread(inc3);
			Thread t4 = new Thread(inc4);
			t1.start();
			t2.start();
			t3.start();
			t4.start();
	}

}
