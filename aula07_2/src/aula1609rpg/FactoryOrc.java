package aula1609rpg;

public class FactoryOrc extends GeradorInimigo {

	@Override
	public Inimigo criarInimigo() {
	
		return new Orc();
	
	}

}