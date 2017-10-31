package lanchonete;

import fabricas.FabricaRT;
import sanduiche.Sanduiche;
import sanduiche.SanduicheRT;

public class LanchoneteRT extends Lanchonete{
	
	public LanchoneteRT(){
		fabrica = new FabricaRT();
	}

	@Override
	protected Sanduiche criarSanduiche() {
		return new SanduicheRT(fabrica);
	}

}
