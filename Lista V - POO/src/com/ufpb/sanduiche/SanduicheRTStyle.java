package com.ufpb.sanduiche;

public class SanduicheRTStyle extends Sanduiche {
	
	public SanduicheRTStyle(){
		super.nome = "à moda Rio Tinto";
		super.pao = "bola";
		super.queijo = "cheddar";
		super.presunto = "de peru";
		super.salada = "sem verdura";
	}

	@Override
	public void prepare() {
		System.out.println("Preparando o sanduíche "+this.nome+"\n"+
							"Duas fatias de pão "+this.pao+"\n"+
							"Adicionando queijo "+this.queijo+"\n"+
							"Adicionando presunto "+this.presunto+"\n"+
							"Salada "+this.salada);		
	}
	
	@Override
	public void bake() {
		System.out.println("Assando sanduíche "+this.nome);
		
	}

}
