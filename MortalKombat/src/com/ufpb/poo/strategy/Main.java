package com.ufpb.poo.strategy;

import com.ufpb.poo.strategy.lutadores.LiuKang;
import com.ufpb.poo.strategy.lutadores.NightWolf;

public class Main {
	
	public static void main (String [] args){
		
		Lutador l1 = new LiuKang();
		Lutador l2 = new NightWolf();
		
		System.out.println("Lutador: "+l1.desenhar()+" Life: "+l1.getLife());
		System.out.println("Lutador: "+l2.desenhar()+" Life: "+l2.getLife());
		
		System.out.println("Liu Kang lança bola de fogo em NightWolf...");
		l1.lancarMagia(l2);
		System.out.println("Lutador: "+l1.desenhar()+" Life: "+l1.getLife());
		System.out.println("Lutador: "+l2.desenhar()+" Life: "+l2.getLife());
		System.out.println("NightWolf atira com arco e flecha em Liu Kang");
		l2.atirar(l1);
		System.out.println("Lutador: "+l1.desenhar()+" Life: "+l1.getLife());
		System.out.println("Lutador: "+l2.desenhar()+" Life: "+l2.getLife());
		System.out.println("Liu Kang chuta NightWolf mas ele defende...");
		l1.chutar(l2);
		l2.defender();
		System.out.println("Lutador: "+l1.desenhar()+" Life: "+l1.getLife());
		System.out.println("Lutador: "+l2.desenhar()+" Life: "+l2.getLife());
		
	}	
}
