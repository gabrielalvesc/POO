package com.ufpb.questao2;

public class Main {

	public static void main(String[] args) {
		Lutador l1 = new Lutador("PureWar",new Machado(), new ArmaduraDeLoriga());
		Lutador l2 = new Lutador("PureMage", new Alabarda(), new ArmaduraDeTitanio());
		
		System.out.println("***** BATALHA *****");
		System.out.println(l1.getNome()+" VS "+l2.getNome());
		
		int rodada = 0;
		
		while (l1.getLife()!=0 || l2.getLife() !=0){
			rodada++;
			System.out.println("Rodada "+rodada);
			if (l1.getLife()==0){
				System.out.println(l2.getNome()+" WINS!!!");
				break;
			} else if (l2.getLife()==0){
				System.out.println(l1.getNome()+" WINS!!!");
				break;
			} else {
				System.out.println(l1.getNome()+" ataca "+l2.getNome());
				l1.atacar(l2);
				l2.defender();
				System.out.println("LIFE "+l2.getNome()+": "+l2.getLife());
				System.out.println("LIFE "+l1.getNome()+": "+l1.getLife());
				System.out.println(l2.getNome()+" ataca "+l1.getNome());
				l2.atacar(l1);
				l1.defender();
				System.out.println("LIFE "+l2.getNome()+": "+l2.getLife());
				System.out.println("LIFE "+l1.getNome()+": "+l1.getLife());
			}
			
		}
		
	}

}
