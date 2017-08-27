package com.ufpb.questao2;

public class Main {

	public static void main(String[] args) {
		Lutador l1 = new Lutador("PureWar",new Machado(), new ArmaduraDeLoriga());
		Lutador l2 = new Lutador("PureMage", new Alabarda(), new ArmaduraDeTitanio());
		
		System.out.println("***** BATALHA *****");
		System.out.println(l1.getNome()+" VS "+l2.getNome());
		
		while (l1.getLife()!=0 || l2.getLife()!=0){
			l1.atacar(l2);
			System.out.println(l1.getNome()+" ataca "+l2.getNome());
			System.out.println(l1.toString()+"\n"+l2.toString()+"\n");
			if (l2.getLife()==0){
				System.out.println(l2.getNome()+" IS DEAD!!! :("+"\n"+l1.getNome()+" VENCE A BATALHA!!! *-*");
				break;
			}
			l2.atacar(l1);
			System.out.println(l2.getNome()+" ataca "+l1.getNome());
			System.out.println(l1.toString()+"\n"+l2.toString()+"\n");
			if (l1.getLife()==0){
				System.out.println(l1.getNome()+" IS DEAD!!! :("+"\n"+l2.getNome()+" VENCE A BATALHA!!! *-*");
				break;
			}
		}
		
	}

}
