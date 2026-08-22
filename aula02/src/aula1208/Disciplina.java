package aula1208;

public class Disciplina {
	
	private String nome;
	private Professor professor;
	
	//Getters e setters:
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	//Construtor:
	public Disciplina(String nome, Professor professor) {
		super();
		this.nome = nome;
		this.professor = professor;
	}
}
