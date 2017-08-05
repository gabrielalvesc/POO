package com.ufpb.poo;

public class Retangulo {
	
	private double largura;
	private double altura;
	
	public Retangulo (){
		this.altura = 0.0;
		this.largura = 0.0;
	}
	
	public Retangulo (double altura, double largura){
		this.altura = altura;
		this.largura = largura;
	}
	
	public double getLargura(){
		return this.largura;
	}
	
	public void setLargura(double largura){
		this.largura = largura;
	}
	
	public double getAltura(){
		return this.altura;
	}
	
	public void setAltura(double altura){
		this.altura = altura;
	}
	
	public double calculaPerimetro(double altura, double largura){
		double perimetro = (altura*2)+(largura*2);
		return perimetro;
	}
	
	public double calculaArea(double altura, double largura){
		double area = altura*largura;
		return area;
	}
	
	@Override
	public boolean equals(Object o){
		if (o==null){
			return false;
		} if (o instanceof Retangulo){
			Retangulo r = (Retangulo) o;
			if (this.altura == r.getAltura() && this.largura == r.getLargura()){
				return true;
			}
		}
		return false;
	}	
	
	public String toString(){
		return "Altura: " +this.altura+ "\nLargura: "+this.largura;
	}

}
