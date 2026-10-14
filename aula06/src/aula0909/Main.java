package aula0909;

public class Main {

	public static void main(String[] args) {

		Notificavel email = new Email();
		Notificavel sms = new Sms();
		
		Loja loja1 = new Loja(email);		
		loja1.getNotificacao().enviar("Loja notificando");
		
		Loja loja2 = new Loja(sms);		
		loja2.getNotificacao().enviar("Loja notificando");

	}

}
