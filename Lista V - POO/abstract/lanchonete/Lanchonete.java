package lanchonete;

import fabricas.FabricaDeIngredientes;
import sanduiche.Sanduiche;

public abstract class Lanchonete {
	
	protected FabricaDeIngredientes fabrica;
	
	public Sanduiche pedirSanduiche(){
		Sanduiche sanduiche = criarSanduiche();
		sanduiche.preparar();
		sanduiche.assar();
		sanduiche.embalar();
		return sanduiche;
	}
	
	protected abstract Sanduiche criarSanduiche(); 

}
