package com.ufpb.questao3;

public class Coordenadas {
	
	private int coordenadaX;
	private int coordenadaY;
	
	public Coordenadas(int x, int y){
		this.coordenadaX = x;
		this.coordenadaY = y;
	}
	
	public Coordenadas(){
		this.coordenadaX = 0;
		this.coordenadaY = 0;
	}

	public int getCoordenadaX() {
		return coordenadaX;
	}

	public void setCoordenadaX(int coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	public int getCoordenadaY() {
		return coordenadaY;
	}

	public void setCoordenadaY(int coordenadaY) {
		this.coordenadaY = coordenadaY;
	}
	
	public String toString(){
		return "X: "+this.coordenadaX+" Y: "+this.coordenadaY+"\n";
	}
	
	@Override
	public boolean equals(Object o){
		if (o==null){
			return false;
		} if (o instanceof Coordenadas){
			Coordenadas c = (Coordenadas) o;
			if (this.coordenadaX == c.getCoordenadaX() && this.coordenadaY == c.getCoordenadaY()){
				return true;
			}
		}
		return false;
	}

}
