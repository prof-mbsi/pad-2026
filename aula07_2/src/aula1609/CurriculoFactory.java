package aula1609;

public class CurriculoFactory extends DocumentoFactory {

	@Override
	public Documento criarDocumento() {
	
		return new Curriculo();
	
	}

}