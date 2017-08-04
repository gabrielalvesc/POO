package com.ufpb.questao9;

public class Quadrados extends Quadrilateros implements FormasGeometricas{
	
	public Quadrados(double lado){
		super(lado);
	}
	
	public double calculaArea(){
		return this.getLado()*this.getLado();
	}
	
	public double calculaPerimetro(){
		return this.getLado()*4;
	}

}
