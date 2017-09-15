package com.ufpb.questao6;

public class MeuCinema {

	public static void main(String[] args) {
		
		DVDPlayer dvd = new DVDPlayer("DVD Player");
		HomeTheaterFacade ht = new HomeTheaterFacade (new Amplificador("Amplificador", dvd), dvd, 
				new LuzAmbiente("Luz Ambiente"), new Pipoqueira ("Pipoqueira"), new Projetor("Projetor", dvd),
				new Tela("Tela") );
		ht.assistirFilme();
		ht.pararFilme();

	}

}
