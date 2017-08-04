package com.ufpb.questao8;

public class TestaCadastro {
	
	public static void main (String [] args){
		
		CadastraPessoas cadastra = new CadastraPessoas();
		
		Cliente c1 = new Cliente("Lucas",new Data(7,7,1997),123);
		Cliente c2 = new Cliente("Marcelo",new Data(8,8,1998),234);
		Cliente c3 = new Cliente("Chaykowsky",new Data(9,9,1999),345);
		cadastra.adicionaPessoa(c1);
		cadastra.adicionaPessoa(c2);
		cadastra.adicionaPessoa(c3);
		
		Funcionario f1 = new Funcionario("Jorge", new Data (4,4,1994), 1000);
		Funcionario f2 = new Funcionario("Gabriel", new Data (5,5,1995), 1000);
		Funcionario f3 = new Funcionario("Kewyn", new Data (6,6,1996), 1000);
		cadastra.adicionaPessoa(f1);
		cadastra.adicionaPessoa(f2);
		cadastra.adicionaPessoa(f3);
		
		Gerente g1 = new Gerente("João", new Data (1,1,1991), 1000, "area");
		Gerente g2 = new Gerente("José", new Data (2,2,1992), 1500, "area");
		Gerente g3 = new Gerente("Maria", new Data (3,3,1993), 1750, "area");
		cadastra.adicionaPessoa(g1);
		cadastra.adicionaPessoa(g2);
		cadastra.adicionaPessoa(g3);
		
		String str = cadastra.imprimeCadastro();
		System.out.print(str);
		
	}

}
