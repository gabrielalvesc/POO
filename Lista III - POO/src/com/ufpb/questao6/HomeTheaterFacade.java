package com.ufpb.questao6;

public class HomeTheaterFacade {
	
	Amplificador amplificador;
	DVDPlayer dvd;
	LuzAmbiente luz;
	Pipoqueira pipoqueira;
	Projetor projetor;
	Tela tela;
	
	public HomeTheaterFacade (Amplificador amplificador, DVDPlayer dvd, LuzAmbiente luz, Pipoqueira pipoqueira, Projetor projetor, Tela tela){
		this.amplificador = amplificador;
		this.dvd = dvd;
		this.luz = luz;
		this.pipoqueira = pipoqueira;
		this.projetor = projetor;
		this.tela = tela;
	}
	
	public void assistirFilme(){
		pipoqueira.on();
		pipoqueira.fazerPipoca();		
		luz.on();
		luz.luminosidadeBaixa();		
		tela.descer();		
		projetor.on();
		projetor.modoWideScreen();		
		amplificador.on();
		amplificador.somStereo();
		amplificador.setVolume(10);		
		dvd.on();
		dvd.play("E o vento levou.....");		
		System.out.println("========================");
		System.out.println(" vou ver o filme ......");
		System.out.println("========================");
	}
	
	public void pararFilme(){
		pipoqueira.off();		
		luz.luminosidadeAlta();		
		tela.subir();		
		projetor.off();		
		amplificador.off();		
		dvd.eject();
		dvd.off();	
		System.out.println("========================");
		System.out.println(" fim do filme ......");
		System.out.println("========================");
	}

}
