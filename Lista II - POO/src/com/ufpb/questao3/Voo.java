package com.ufpb.questao3;

public class Voo {
	
	private int nVoo;
	private String empresa;
	private String horario;
	private String tipoVoo;
	
	public Voo(int nVoo, String empresa, String horario, String tipoVoo){
		this.nVoo = nVoo;
		this.empresa = empresa;
		this.horario = horario;
		this.tipoVoo = tipoVoo;
	}

	public int getnVoo() {
		return nVoo;
	}

	public void setnVoo(int nVoo) {
		this.nVoo = nVoo;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getTipoVoo() {
		return tipoVoo;
	}

	public void setTipoVoo(String tipoVoo) {
		this.tipoVoo = tipoVoo;
	}
	
	@Override
	public String toString(){
		return "Número do vôo: "+this.nVoo+"\n"
				+"Empresa: "+this.empresa+"\n"
				+"Hórario: "+this.horario+"\n"
				+"Tipo: "+this.tipoVoo+"\n";
	}
	

}
