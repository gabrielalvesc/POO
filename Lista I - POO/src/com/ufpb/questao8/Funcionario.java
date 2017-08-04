package com.ufpb.questao8;

public class Funcionario extends Pessoa{
	
	private float salario;
	
	public Funcionario(){
		this.salario = 0;
	}
	
	public Funcionario(String nome, Data nascimento, float salario){
		super(nome, nascimento);
		this.salario = salario;
		
	}
	
	public float getSalario(){
		return this.salario;
	}
	
	public void setSalario(float salario){
		this.salario = salario;
	}
	
	public double calculaImposto(){
		return (this.getSalario()*3)/100;
	}
	
	public String imprimeDados(){
		double imposto = calculaImposto();
		return "Nome: "+this.getNome()+"\n"+"Data de nascimento: "+this.getNascimento().toString()+"\n"+"Salário: "+this.salario+"\n"+"Imposto: "+imposto;
	}

}
