package aula1208;

public class Aluno {
	
	private String nome;

	//Getters e setters:
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Construtor:
	public Aluno(String nome) {
		super();
		this.nome = nome;
	}
	public Aluno() {}
}
