package com.ufpb.poo.observer;

import java.util.ArrayList;
import java.util.List;

public class Pessoa implements Observer{
	
	private String nome;
	private String cpf;
	private Subject subject;
	private List<String> revistas;
	
	public Pessoa(){
		this.nome = "";
		this.cpf = "";
		this.subject = new Editora();
		this.revistas = new ArrayList<String>();
	}
	
	public List<String> getRevistas() {
		return revistas;
	}

	public void setRevistas(List<String> revistas) {
		this.revistas = revistas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Subject getSubject(){
		return this.subject;
	}
	
	public void setSubject(Subject subject){
		this.subject = subject;
	}

	@Override
	public void update(Object obj) {
		String s = (String) obj;
		System.out.println(this.nome+", saiu uma nova revista: "+s);
		this.revistas.add(s);
	}
	
	@Override
	public String toString(){
		return "Nome: "+this.nome+"\n"+"CPF: "+this.cpf+"\n";
	}

}
