package com.ufpb.questao2;

public class Pessoa {
	
	private String nome;
	private int idade;
	private Double altura;
	private Double peso;
	private String sexo;
	
	public Pessoa(){
		this.nome = "";
		this.idade = 0;
		this.altura = 0.0;
		this.peso = 0.0;
		this.sexo = "";
	}
	
	public Pessoa (String nome, int idade, Double altura, Double peso, String sexo){
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.sexo = sexo;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome (String nome){
		this.nome = nome;
	}
	
	public int getIdade(){
		return this.idade;
	}
	
	public void setIdade(int idade){
		this.idade = idade;
	}
	
	public Double getAltura(){
		return this.altura;
	}
	
	public void setAltura(Double altura){
		this.altura = altura;
	}
	
	public Double getPeso(){
		return this.peso;
	}
	
	public void setPeso(Double peso){
		this.peso = peso;
	}
	
	public String getSexo(){
		return this.sexo;
	}
	
	public void setSexo (String sexo){
		this.sexo = sexo;
	}
	
	public Double calculaImc(Double peso, Double altura){
		return peso/(altura*altura);
	}
	
	public String toString(){
		Double imc = calculaImc(this.peso, this.altura);
		if (imc <= 18.5){
			return this.nome+" é uma pessoa do sexo "+this.sexo+" e está abaixo do seu peso normal. IMC: "+imc;
		} else if (18.5 < imc && imc <= 25.0){
			return this.nome+" é uma pessoa do sexo "+this.sexo+" e está com seu peso normal. IMC: "+imc;
		} else if (25.0 < imc && imc <= 30.0){
			return this.nome+" é uma pessoa do sexo "+this.sexo+" e está acima do peso normal. IMC: "+imc;
		} else {
			return this.nome+" é uma pessoa do sexo "+this.sexo+" e está com obesidade. IMC: "+imc;
		}
		 
	}
	

}
