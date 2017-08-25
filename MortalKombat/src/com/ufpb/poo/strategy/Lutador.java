package com.ufpb.poo.strategy;

import com.ufpb.poo.strategy.comportamentoAtirador.ComportamentoAtirador;
import com.ufpb.poo.strategy.comportamentoBruxo.ComportamentoBruxo;

public abstract class Lutador {
	
	protected ComportamentoAtirador comportamentoAtirador;
	protected ComportamentoBruxo comportamentoBruxo;
	private int life;
	
	public Lutador(){
		this.life = 100;
	}
	
	public int getLife(){
		return this.life;
	}
	
	public void setLife(int life){
		if (life < 0){
			System.out.println("IS DEAD");
			this.life = 0;
		} else if (life > 100){
			this.life = 100;
		} else {
			this.life = life;
		}
	}
	
	public void socar(Lutador l){
		l.setLife(l.getLife() - 3);
	}
	
	public void chutar(Lutador l){
		l.setLife(l.getLife() - 3);
	}
	
	public void atirar(Lutador l){
		l.setLife(l.getLife()- this.comportamentoAtirador.atirar());
	}
	
	public void lancarMagia(Lutador l){
		l.setLife(l.getLife() - this.comportamentoBruxo.lancarMagia());
	}
	
	public abstract String desenhar();
	
	public void defender(){
		this.setLife(this.getLife() + 3);
	}
	
	

}
