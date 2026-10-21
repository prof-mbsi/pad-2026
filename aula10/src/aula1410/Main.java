package aula1410;

public class Main {
	
	public static void main(String[] args) {

        AgenciaNoticias agencia = new AgenciaNoticias();

        Observer email = new EmailSubscriber("João");

        Observer sms = new SmsSubscriber("Maria");

        Observer push = new PushSubscriber("Carlos");

        agencia.adicionar(email);
        agencia.adicionar(sms);
        agencia.adicionar(push);

        agencia.publicarNoticia("Java 30 foi lançado!");

        agencia.remover(sms);

        agencia.publicarNoticia("Nova versão do Spring disponível!");
    }

}
