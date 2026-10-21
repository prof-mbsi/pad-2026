package aula1410;

public class PushSubscriber implements Observer {

private String nome;

	public PushSubscriber(String nome) {
	
		this.nome = nome;
	
	}
	
	@Override
	public void atualizar(String msg) {
	
		System.out.println(nome + " recebeu PUSH: " + msg);
	
	}
}