package aula2810;

public class Main {

	public static void main(String[] args) {
		
		Inimigo orcOriginal = new Inimigo("Orc", 100);
		Inimigo orc1 = orcOriginal.clonar();
		Inimigo orc2 = orcOriginal.clonar();
		
		orc1.exibir();
		orc2.exibir();
	}

}
