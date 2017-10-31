package com.ufpb.sanduiche;

public class SanduicheCGStyle extends Sanduiche {
	
	public SanduicheCGStyle(){
		super.nome = "á moda Campina Grande";
		super.pao = "integral";
		super.queijo = "prato";
		super.presunto = "de frango";
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
