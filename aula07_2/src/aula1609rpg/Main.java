package aula1609rpg;

public class Main {
	
	public static void main(String[] args) {

        int nivelJogador = 15;

        GeradorInimigo fabrica;

        if(nivelJogador < 5) {

            fabrica = new FactoryGoblin();

        }
        else if(nivelJogador < 10) {

            fabrica = new FactoryOrc();

        }
        else {

            fabrica = new FactoryDragao();

        }

        Inimigo inimigo = fabrica.criarInimigo();

        inimigo.atacar();

    }

}
