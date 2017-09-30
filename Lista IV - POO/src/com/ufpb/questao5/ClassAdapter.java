package com.ufpb.questao5;

public class ClassAdapter extends MedidorFarenheit implements MedidorCelsiusIF {

	@Override
	public double medirTemperatura() {
		return (super.getMedidorFarenheit()-32)/1.8;
	}

}
