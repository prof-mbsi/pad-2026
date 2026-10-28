package aula2810;

public class Inimigo implements Prototype{
	
	private String nome;
	private int vida;

	public Inimigo(String nome, int vida) {
		super();
		this.nome = nome;
		this.vida = vida;
	}

	@Override
	public Inimigo clonar() {
		return new Inimigo(this.nome, this.vida);
	}
	
	public void exibir() {
		System.out.println(this.nome + ", vida: " + this.vida);
	}
}
