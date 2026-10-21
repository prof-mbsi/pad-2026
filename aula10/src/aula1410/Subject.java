package aula1410;

public interface Subject {

    void adicionar(Observer observer);

    void remover(Observer observer);

    void notificar(String msg);

}