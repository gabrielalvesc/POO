package com.ufpb.questao3;

import java.util.ArrayList;
import java.util.List;

public class Totens implements Observer{
	
	private Subject subject;
	private List<Voo> voos;
	private int tipoToten;

	public Totens(Subject subject, List<Voo> voos, int tipoToten) {
		this.subject = subject;
		this.voos = voos;
		this.tipoToten = tipoToten;
	}
	
	public Totens(int tipoToten){
		this.subject = new Aeroporto();
		this.voos = new ArrayList<Voo>();
		this.tipoToten = tipoToten;
	}
	
	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public List<Voo> getVoos() {
		return this.voos;
	}
	
	public int getTipoToten(){
		return this.tipoToten;
	}
	
	public void setTipoToten(int tipoToten){
		this.tipoToten = tipoToten;
	}

	@Override
	public void update(Object obj) {
		Voo novoVoo = (Voo) obj;
		if (this.voos.contains(novoVoo)){
			System.out.println("Vôo já registrado");
		} else {
			this.voos.add(novoVoo);
		}
	}
	
	@Override
	public String toString(){		
		
		String str = "";
		for (Voo v: this.voos){
			if (this.tipoToten==0 && v.getTipoVoo().equals("EMBARQUE")){
				str+=v.toString();
			} else if (this.tipoToten ==1 && v.getTipoVoo().equals("DESEMBARQUE")){
				str+=v.toString();
			} else if (this.tipoToten==2){
				str+=v.toString();
			}	
		} 
		return str;
	}

}
