package aula1410;

import java.util.ArrayList;
import java.util.List;

public class AgenciaNoticias implements Subject {

    private List<Observer> assinantes = new ArrayList<>();

    @Override
    public void adicionar(Observer observer) {

        assinantes.add(observer);

    }

    @Override
    public void remover(Observer observer) {

        assinantes.remove(observer);

    }

    @Override
    public void notificar(String msg) {

        for (Observer observer : assinantes) {

            observer.atualizar(msg);

        }

    }

    public void publicarNoticia(String noticia) {

        System.out.println("\nAGÊNCIA: " + noticia);
        notificar(noticia);

    }
}