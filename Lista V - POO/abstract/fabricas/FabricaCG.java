package fabricas;

import ingredientes.*;

public class FabricaCG implements FabricaDeIngredientes {

	@Override
	public Pao criarPao() {
		return new PaoIntegral();
	}

	@Override
	public Queijo criarQueijo() {
		return new QueijoPrato();
	}

	@Override
	public Presunto criarPresunto() {
		return new PresuntoDeFrango();
	}

	@Override
	public Salada criarSalada() {
		return new SemVerdura();
	}

}
