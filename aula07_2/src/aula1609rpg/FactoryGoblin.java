package aula1609rpg;

public class FactoryGoblin extends GeradorInimigo {

	@Override
	public Inimigo criarInimigo() {
	
		return new Goblin();
	
	}

}