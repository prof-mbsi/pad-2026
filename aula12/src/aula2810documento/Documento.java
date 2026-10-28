package aula2810documento;

public class Documento implements Prototype<Documento>{
	
	private int numero;
	private String nome;
	private String conteudo;
	
	public Documento(int numero, String nome, String conteudo) {
		this.numero = numero;
		this.nome = nome;
		this.conteudo = conteudo;
	}

	@Override
	public Documento clonar() {
		return new Documento(this.numero, this.nome, this.conteudo);
	}
	
	public void exibir() {
		System.out.println("Número: " + this.numero + ", nome: " 
				+ this.nome + ", conteúdo: " + this.conteudo);
	}
}