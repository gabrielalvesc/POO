package com.ufpb.sanduiche;

public class SanduicheJPStyle extends Sanduiche {
	
	public SanduicheJPStyle(){
		super.nome = "à moda João Pessoa";
		super.pao = "francês";
		super.queijo = "mussarela";
		super.presunto = "de frango";
		super.salada = "com verdura";
	}

	@Override
	public void prepare() {
		System.out.println("Preparando sanduiche "+this.nome+"\n"+
							"Duas fatias de pão "+this.nome+"\n"+
							"Adicionando queijo "+this.queijo+"\n"+
							"Adicionando presunto "+ this.presunto+"\n"+
							"Salada "+this.salada);		
	}

	@Override
	public void bake() {
		System.out.println("Assando sanduíche "+this.nome);
		
	}

}
