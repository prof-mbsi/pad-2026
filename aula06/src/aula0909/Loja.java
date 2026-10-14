package aula0909;

public class Loja {

    private Notificavel notificacao;

    public Loja(Notificavel notificacao) {

        this.notificacao = notificacao;

    }

	public Notificavel getNotificacao() {
		return notificacao;
	}

	public void setNotificacao(Notificavel notificacao) {
		this.notificacao = notificacao;
	}

}