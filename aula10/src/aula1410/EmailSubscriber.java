package aula1410;

public class EmailSubscriber implements Observer {

private String nome;

	public EmailSubscriber(String nome) {
	
		this.nome = nome;
	
	}
	
	@Override
	public void atualizar(String msg) {
	
		System.out.println(nome + " recebeu EMAIL: " + msg);
	
	}
}