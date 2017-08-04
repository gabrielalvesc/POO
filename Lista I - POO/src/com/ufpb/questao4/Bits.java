package com.ufpb.questao4;

public class Bits {
	
	private boolean [] bits;
	
	public Bits(int quant){
		this.bits = new boolean[quant];
	}
	
	public boolean [] getBits(){
		return this.bits;
	}
	
	public void modificarBit(int posicao, boolean novoBit, int quant){
		for (int i=0; i<quant; i++){
			if (i==posicao){
				this.bits[i] = novoBit;			
			}
		}
	}
	
	public boolean acessarBit(int posicao, int quant){
		boolean b = false;
		for (int i=0; i<quant; i++){
			if (i==posicao){
				b =  this.bits[i];
			} 
			
		}
		return b;
	}
	
	public String toString(int quant){
		String str = "";
		for (int i=0; i<quant; i++){
			if (this.bits[i]==true){
				str+="1 ";
			} else {
				str+="0 ";
			}
		}
		return str;
	}
	
	public boolean [] and (boolean [] l1, int quant){
		boolean [] result = new boolean[quant];
		for (int i=0; i<quant; i++){
			if (l1[i]==true && this.bits[i]==true){
				result[i] = true;
			} else {
				result[i] = false;
			}
		}
		return result;
	}
	
	public boolean [] or (boolean [] l1, int quant){
		boolean [] result = new boolean[quant];
		for (int i=0; i<quant; i++){
			if (l1[i]==false && this.bits[i]==false){
				result[i] = false;
			} else {
				result[i] = true;
			}
		}
		return result;
	}
	
	public boolean [] not (int quant){
		boolean [] result = new boolean[quant];
		for (int i=0; i<quant; i++){
			if (this.bits[i]==true){
				result[i] = false;
			} else {
				result[i] = true;
			}
		}
		return result;
	}

}
