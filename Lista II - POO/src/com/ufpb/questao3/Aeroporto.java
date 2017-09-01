package com.ufpb.questao3;

import java.util.ArrayList;
import java.util.List;

public class Aeroporto implements Subject {
	
	private List<Observer> totens;
	
	public Aeroporto(){
		this.totens = new ArrayList<Observer>();
	}
	
	public List<Observer> getTotens(){
		return this.totens;
	}

	@Override
	public void registerObserver(Observer o) {
		if (totens.contains(o)){
			System.out.println("Toten já cadastrado");
		} else {
			this.totens.add((Totens) o);
		}
		
	}

	@Override
	public void removeObserver(Observer o) {
		this.totens.remove(o);
	}

	@Override
	public void notify(Object obj) {
		Voo novoVoo = (Voo) obj;
		for (Observer o: this.totens){
			o.update(novoVoo);
		}
		
	}


}
