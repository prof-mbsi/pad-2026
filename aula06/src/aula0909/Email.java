package aula0909;

public class Email implements Notificavel {

	@Override
	public void enviar(String mensagem) {
	
		System.out.println("Email: " + mensagem);
	
	}

}