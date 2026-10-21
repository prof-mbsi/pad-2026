package aula2110;

public class Main {

	public static void main(String[] args) {
		Cafe c = new ComLeite(new CafeSimples());
		System.out.println(c.getDescricao() + ": " + c.getPreco());
	}
}
