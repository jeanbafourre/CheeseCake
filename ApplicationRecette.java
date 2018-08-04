
public class ApplicationRecette {

	public static void main(String[] args) {
		// Je créé une instance de la classe Gateau appelée "ingrCommuns"
		Gateau ingrCommuns = new Gateau();
		
		// Je créé une instance de la classe "CheeseCake" appelée "ingrCheeseCake"
		CheeseCake ingrCheeseCake = new CheeseCake();
		
		// J'initialise les variables 
		ingrCommuns.setBeurre(" g de beurre");
		ingrCommuns.setSucre(" g de sucre blond en poudre");
		ingrCheeseCake.setFromageBlanc(" g de fromage blanc");
		ingrCheeseCake.setBiscuits(" g de biscuits écrasés");
		ingrCheeseCake.setCremeFraiche(" cl de crème fraîche entière");
		ingrCheeseCake.setGelatine(" feuilles de gélatine");
		ingrCommuns.setI(1);
		
		// J'appelle ma méthode
		ingrCommuns.afficherRecette(ingrCheeseCake);
		

	}

}
