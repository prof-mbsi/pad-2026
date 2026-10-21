package aula1410;

public class SmsSubscriber implements Observer {

	private String nome;
	
	public SmsSubscriber(String nome) {
	
		this.nome = nome;
	
	}
	
	@Override
	public void atualizar(String msg) {
	
		System.out.println(nome + " recebeu SMS: " + msg);
	
	}
}