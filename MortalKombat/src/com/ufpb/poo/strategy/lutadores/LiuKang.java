package com.ufpb.poo.strategy.lutadores;

import com.ufpb.poo.strategy.Lutador;
import com.ufpb.poo.strategy.comportamentoAtirador.NaoAtirar;
import com.ufpb.poo.strategy.comportamentoBruxo.LancarBolaDeFogo;

public class LiuKang extends Lutador{
	
	public LiuKang(){
		comportamentoAtirador = new NaoAtirar();
		comportamentoBruxo = new LancarBolaDeFogo();
	}
	
	public String desenhar(){
		return "LIU KANG";
	}

}
