package fabricas;

import ingredientes.*;

public interface FabricaDeIngredientes {
	
	public Pao criarPao();
	public Queijo criarQueijo();
	public Presunto criarPresunto();
	public Salada criarSalada();

}
