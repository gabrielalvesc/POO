package com.ufpb.questao3;

import java.util.ArrayList;
import java.util.List;

public class Poligono {
	
	private List<Coordenadas> pontos;
	
	public Poligono(){
		this.pontos = new ArrayList<Coordenadas>();
	}
	
	public Poligono(List<Coordenadas> pontos){
		this.pontos = pontos;
	}
	
	public void adicionaPonto(Coordenadas c){
		this.pontos.add(c);
	}
	
	public void removePonto(Coordenadas c){
		for (Coordenadas p: this.pontos){
			if (p.equals(c)){
				this.pontos.remove(p);
			}
		}
	}
	
	public double calculaArea(){
		double area = 0;
		int tamanho = this.pontos.size();
		int [] coordenadaX = new int [tamanho];
		int [] coordenadaY = new int [tamanho];
		int indice = 0;
		for(Coordenadas c: this.pontos){
			coordenadaX[indice] = c.getCoordenadaX();
			coordenadaY[indice] = c.getCoordenadaY();
			indice++;
		}
		for (int i=0; i<tamanho; i++){
			if (i==tamanho-1){
				break;
			}
			double soma = (coordenadaX[i] * coordenadaY[i+1]) - (coordenadaX[i+1] * coordenadaY[i]);
			area+=soma;
		}
		area=area/2;
		return area;
	}
	
	public String toString(){
		String str = "";
		double area = calculaArea();
		for (Coordenadas c: this.pontos){
			str+= c.toString(); 
		}
		return "***** Coordenadas *****\n\n"+str+"\n"+"Área: "+area;
	}
	
	

}
