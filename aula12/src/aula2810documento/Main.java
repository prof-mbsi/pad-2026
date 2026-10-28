package aula2810documento;

public class Main {

	public static void main(String[] args) {
		Documento original = new Documento(0, "Ofício", "Ordem de serviço");
		Documento copia1 = original.clonar();
		Documento copia2 = original.clonar();
		Documento copia3 = original.clonar();
		
		copia1.exibir();
		copia2.exibir();
		copia3.exibir();
	}

}
