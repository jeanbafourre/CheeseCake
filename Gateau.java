
public class Gateau implements Interface {

	String farine; 
	String beurre;
	String oeuf;
	String sucre;
	int i;

	public String getFarine() {
		return farine;
	}

	public void setFarine(String farine) {
		this.farine = farine;
	}

	public String getBeurre() {
		return beurre;
	}

	public void setBeurre(String beurre) {
		this.beurre = beurre;
	}

	public String getOeuf() {
		return oeuf;
	}

	public void setOeuf(String oeuf) {
		this.oeuf = oeuf;
	}

	public String getSucre() {
		return sucre;
	}

	public void setSucre(String sucre) {
		this.sucre = sucre;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public void afficherRecette(CheeseCake monCheese) {	
		System.out.println(i + getBeurre() + monCheese.getFromageBlanc());
	}

		
	}