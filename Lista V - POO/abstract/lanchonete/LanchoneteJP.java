package lanchonete;

import fabricas.FabricaJP;
import sanduiche.Sanduiche;
import sanduiche.SanduicheJP;

public class LanchoneteJP extends Lanchonete {
	
	public LanchoneteJP(){
		fabrica = new FabricaJP();
	}

	@Override
	protected Sanduiche criarSanduiche() {
		return new SanduicheJP(fabrica);
	}

}
