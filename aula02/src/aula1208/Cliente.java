package aula1208;

public class Cliente {
	
	private String nome;
	private String email;
	
	//Getters e setters:
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	//Construtor:
	public Cliente(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}
}
