package aula1609;

public class RelatorioFactory extends DocumentoFactory {

	@Override
	public Documento criarDocumento() {
	
		return new Relatorio();
	
	}

}