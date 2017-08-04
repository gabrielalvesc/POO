package com.ufpb.questao9;

public class Retangulos extends Quadrilateros implements FormasGeometricas{
	
	public Retangulos(double base, double altura){
		super(base, altura);
	}
	
	public double calculaArea(){
		return this.getAltura() * this.getBase();
	}
	
	public double calculaPerimetro(){
		return (this.getBase()*2)+(this.getAltura()*2);
	}
		
}
