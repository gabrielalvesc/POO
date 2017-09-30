package com.ufpb.questao5;

public class Adapter implements MedidorCelsiusIF {
	
	private MedidorFarenheit medFar;
	
	public Adapter(){
		this.medFar = new MedidorFarenheit();
	}

	@Override
	public double medirTemperatura() {
		return (medFar.getMedidorFarenheit()-32)/1.8;
	}

}
