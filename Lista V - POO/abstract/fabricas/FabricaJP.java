package fabricas;

import ingredientes.*;


public class FabricaJP implements FabricaDeIngredientes{

	@Override
	public Pao criarPao() {
		return new PaoFrances();
	}

	@Override
	public Queijo criarQueijo() {
		return new QueijoMussarela();
	}

	@Override
	public Presunto criarPresunto() {
		return new PresuntoDeFrango();
	}

	@Override
	public Salada criarSalada() {
		return new ComVerdura();
	}

}
