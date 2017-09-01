package com.ufpb.questao3;

public interface Subject {
	
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notify(Object obj);

}
