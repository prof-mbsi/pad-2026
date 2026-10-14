package aula1609;

public class Main {

	public static void main(String[] args) {
		
		ConfiguracaoSistema c1 = ConfiguracaoSistema.getInstance();

        ConfiguracaoSistema c2 = ConfiguracaoSistema.getInstance();

        c1.setTema("Dark Mode");

        System.out.println(c1.getTema());

        System.out.println(c2.getTema());

        System.out.println(c1 == c2);

	}

}
