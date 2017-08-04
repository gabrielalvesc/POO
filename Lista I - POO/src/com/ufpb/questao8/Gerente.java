package com.ufpb.questao8;

public class Gerente extends Funcionario{
	
	private String area;
	
	public Gerente(){
		this.area = "";
	}
	
	public Gerente(String nome, Data nascimento, float salario, String area){
		super(nome, nascimento, salario);
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	public double calculaImposto(){
		return (this.getSalario()*5)/100;
	}
	
	public String imprimeDados(){
		double imposto = calculaImposto();
		String str = "Nome: "+this.getNome()+"\n"+"Data de nascimento: "+this.getNascimento().toString()+"\n"+"Área: "+this.area+"\n"
				+"Salário: "+this.getSalario()+"\n"+"Imposto: "+imposto;
		return str;
	}

}
