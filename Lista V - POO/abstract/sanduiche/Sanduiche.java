package sanduiche;

import fabricas.FabricaDeIngredientes;
import ingredientes.*;

public abstract class Sanduiche {
	
	protected FabricaDeIngredientes fabrica;
	protected Pao pao;
	protected Queijo queijo;
	protected Presunto presunto;
	protected Salada salada;
	protected String nome;
	
	public abstract void preparar();
	
	public void assar(){
		System.out.println("Assando o "+this.nome);
	}
	
	public void embalar(){
		System.out.println("Embalando o "+this.nome);
	}
	
	@Override
	public String toString(){
		String descricao = "Sanduíche: "+this.nome+"\n"+pao.getDescricao()+", "+queijo.getDescricao()+", "+presunto.getDescricao()+", "+salada.getDescricao();
		return descricao;
	}

}
