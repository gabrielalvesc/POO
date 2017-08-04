package com.ufpb.questao9;

public class Circulo implements FormasGeometricas{
	
	private double raio;
	
	public Circulo(double raio){
		this.raio = raio;
	}
	
	public double calculaArea(){
		return 3.14*(this.raio*this.raio);
	}
	
	public double calculaPerimetro(){
		return 2 * 3.14 * this.raio;
	}
	
	public double getRaio(){
		return this.raio;
	}
	
	

}
