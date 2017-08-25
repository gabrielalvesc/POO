package com.ufpb.poo.strategy.lutadores;

import com.ufpb.poo.strategy.Lutador;
import com.ufpb.poo.strategy.comportamentoAtirador.AtirarComArcoEFlecha;
import com.ufpb.poo.strategy.comportamentoBruxo.LancarNada;

public class NightWolf extends Lutador {
	
	public NightWolf(){
		comportamentoAtirador = new AtirarComArcoEFlecha();
		comportamentoBruxo = new LancarNada();
	}
	
	public String desenhar(){
		return "NIGHTWOLF";
	}

}
