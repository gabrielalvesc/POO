package com.ufpb.questao9;

public abstract class Quadrilateros implements FormasGeometricas{
	
	private double base;
	private double altura;
	private double lado;
	
	public Quadrilateros(double base, double altura){
		this.base = base;
		this.altura = altura;
	}
	
	public Quadrilateros(double lado){
		this.lado = lado;
	}
	
	public abstract double calculaPerimetro();
	
	public void setBase(double base) {
		this.base = base;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getBase(){
		return this.base;
	}
	
	public double getAltura(){
		return this.altura;
	}
	
	public double getLado(){
		return this.lado;
	}

}
