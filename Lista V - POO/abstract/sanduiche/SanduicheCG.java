package sanduiche;

import fabricas.FabricaDeIngredientes;

public class SanduicheCG extends Sanduiche{
	
	public SanduicheCG (FabricaDeIngredientes fabrica){
		super.fabrica = fabrica;
		super.nome = "sanduíche à moda Campina Grande";
		super.pao = fabrica.criarPao();
		super.queijo = fabrica.criarQueijo();
		super.presunto = fabrica.criarPresunto();
		super.salada = fabrica.criarSalada();	
	}

	@Override
	public void preparar() {
		System.out.println("Preprarando "+this.nome+"...");
		pao = fabrica.criarPao();
		queijo = fabrica.criarQueijo();
		presunto = fabrica.criarPresunto();
		salada = fabrica.criarSalada();
		
	}

}
