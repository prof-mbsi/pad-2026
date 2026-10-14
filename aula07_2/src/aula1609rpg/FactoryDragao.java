package aula1609rpg;

public class FactoryDragao extends GeradorInimigo {

	@Override
	public Inimigo criarInimigo() {
	
		return new Dragao();
	
	}

}