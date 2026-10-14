package aula1609;

public class Main {
	
	public static void main(String[] args) {

        DocumentoFactory fabrica;

        fabrica = new RelatorioFactory();

        Documento doc = fabrica.criarDocumento();

        doc.abrir();

    }

}
