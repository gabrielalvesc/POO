package com.ufpb.poo.observer;

import java.util.ArrayList;
import java.util.List;

public class Editora implements Subject{
	
	private List<Observer> observers;
	
	public Editora(){
		this.observers = new ArrayList<Observer>();
	}
	
	public Editora(List<Observer> obs){
		this.observers = obs;
	}
	
	public List<Observer> getObservers(){
		return this.observers;
	}

	@Override
	public void registerObserver(Observer o) {
		if (observers.contains(o)){
			System.out.println("Assinante já cadastrado");
		} else {
			this.observers.add(o);
		}
	}

	@Override
	public void removeObserver(Observer o){
		this.observers.remove(o);
	}

	@Override
	public void notifyObservers(String s) {
		System.out.println("Notificando...");
		for (Observer o: this.observers){
			o.update(s);
		}
	}
	


}
