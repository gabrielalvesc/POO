package com.ufpb.atvaula6;

public class Time {
	
	private int horas;
	private int minutos;
	
	public Time(){
		this.horas = 00;
		this.minutos = 00;
	}
	
	public Time(int horas, int minutos){
		this.horas = horas;
		this.minutos = minutos;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		if (horas>0 && horas<24){
			this.horas = horas;
		}
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		if (minutos>0 && minutos<59){
			this.minutos = minutos;
		}
	}
	
	public String toString(){
		return this.horas+"h"+this.minutos+"min";
	}

}
