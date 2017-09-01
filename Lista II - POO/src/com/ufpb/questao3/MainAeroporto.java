package com.ufpb.questao3;

public class MainAeroporto {

	public static void main(String[] args) {
		
		Aeroporto aeroporto = new Aeroporto();
		
		//Totens
		Totens totenEmbarque = new Totens(0);
		aeroporto.registerObserver(totenEmbarque);
		Totens totenDesembarque = new Totens(1);
		aeroporto.registerObserver(totenDesembarque);
		Totens totenGeral = new Totens(2);
		aeroporto.registerObserver(totenGeral);
		
		//Vôos Embarque
		Voo vooAzul = new Voo (123, "Azul", "08:00", "EMBARQUE");
		Voo vooGol = new Voo (456, "GOl", "09:00", "EMBARQUE");
		Voo vooTam = new Voo (789, "TAM", "10:00", "EMBARQUE");
		
		//Vôos Desembarque
		Voo vooItalian = new Voo (787, "Italian", "08:00", "DESEMBARQUE");
		Voo vooEmirates = new Voo (345, "Fly Emirates", "09:00", "DESEMBARQUE");
		Voo vooAmerican = new Voo (678, "American Airlaines", "10:00", "DESEMBARQUE");
		
		aeroporto.notify(vooAzul);
		aeroporto.notify(vooGol);
		aeroporto.notify(vooTam);
		aeroporto.notify(vooItalian);
		aeroporto.notify(vooEmirates);
		aeroporto.notify(vooAmerican);
		
		for (Observer o: aeroporto.getTotens()){
			System.out.println(o.toString());
		}
		
		aeroporto.removeObserver(totenGeral);
		aeroporto.removeObserver(totenEmbarque);
		
		for (Observer o: aeroporto.getTotens()){
			System.out.println(o.toString());
		}
		
	}	
}
