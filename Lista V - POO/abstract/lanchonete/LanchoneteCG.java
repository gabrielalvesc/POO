package lanchonete;

import fabricas.FabricaCG;
import sanduiche.Sanduiche;
import sanduiche.SanduicheCG;

public class LanchoneteCG extends Lanchonete {
	
	public LanchoneteCG(){
		fabrica = new FabricaCG();
	}

	@Override
	protected Sanduiche criarSanduiche() {
		return new SanduicheCG(fabrica);
	}

}
