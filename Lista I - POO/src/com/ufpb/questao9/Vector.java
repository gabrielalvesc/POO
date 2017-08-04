package com.ufpb.questao9;

import java.util.ArrayList;
import java.util.List;

public class Vector {
	
	private List<Quadrilateros> listaQuadrilateros;
	private List<Circulo> listaCirculo;
	
	public Vector(){
		this.listaQuadrilateros = new ArrayList<Quadrilateros>();
		this.listaCirculo = new ArrayList<Circulo>();
	}
	
	public void adicionaQuadrilateros(Quadrilateros q){
		this.listaQuadrilateros.add(q);
	}
	
	public void adicionaCirculo(Circulo c){
		this.listaCirculo.add(c);
	}
	
	public List<Quadrilateros> getQuadrilateros(){
		return this.listaQuadrilateros;
	}
	
	public List<Circulo> getCirculos(){
		return this.listaCirculo;
	}
	
	
	

}
