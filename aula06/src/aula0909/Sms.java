package aula0909;

public class Sms implements Notificavel {

	@Override
	public void enviar(String mensagem) {
	
		System.out.println("SMS: " + mensagem);

	}

}