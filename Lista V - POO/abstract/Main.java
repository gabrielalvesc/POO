import fabricas.FabricaDeIngredientes;
import fabricas.*;
import lanchonete.Lanchonete;
import lanchonete.LanchoneteCG;
import lanchonete.LanchoneteJP;
import lanchonete.LanchoneteRT;
import sanduiche.Sanduiche;
import sanduiche.*;

public class Main {
	
	public static void main(String[] args) {
		
		FabricaDeIngredientes fabRT = new FabricaRT();
		FabricaDeIngredientes fabCG = new FabricaCG();
		FabricaDeIngredientes fabJP = new FabricaJP();
		
		Lanchonete lanRT = new LanchoneteRT();
		lanRT.pedirSanduiche();
		System.out.println("***************\n");
		
		Lanchonete lanCG = new LanchoneteCG();
		lanCG.pedirSanduiche();
		System.out.println("***************\n");
		
		Lanchonete lanJP = new LanchoneteJP();
		lanJP.pedirSanduiche();
		System.out.println("***************\n");
		
		Sanduiche sanRT = new SanduicheRT(fabRT);
		Sanduiche sanCG = new SanduicheCG(fabCG);
		Sanduiche sanJP = new SanduicheJP(fabJP);
		
		System.out.println(sanRT.toString());
		System.out.println(sanCG.toString());
		System.out.println(sanJP.toString());
		
	}

}
