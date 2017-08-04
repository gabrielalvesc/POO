package com.ufpb.questao8;

import java.util.ArrayList;
import java.util.List;

public class CadastraPessoas{
	
	private List<Pessoa> pessoas;
	
	public CadastraPessoas(){
		this.pessoas = new ArrayList<Pessoa>();
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	
	public void adicionaPessoa(Pessoa p){
		pessoas.add(p);
	}
	
	public String imprimeCadastro(){
		String str = "";
		for (Pessoa p: this.pessoas){
			if (p instanceof Cliente){
				str+= ("\n***** CLIENTE *****\n"+p.imprimeDados()+"\n");
			} else if (p instanceof Gerente){
				str+= ("\n***** GERENTE *****\n"+p.imprimeDados()+"\n");
			} else if (p instanceof Funcionario){
				str+= ("\n***** FUNCIONÁRIO *****\n"+p.imprimeDados()+"\n");
			} 
		} 
		return str;
	}

}
