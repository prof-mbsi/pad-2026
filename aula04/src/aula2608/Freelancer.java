package aula2608;

public class Freelancer implements Pagavel {

    private String nome;
    private int horasTrabalhadas;
    private double valorHora;

    public Freelancer(String nome,
                      int horasTrabalhadas,
                      double valorHora) {

        if (horasTrabalhadas < 0 || valorHora < 0) {
            throw new IllegalArgumentException(
                "Horas e valor da hora devem ser positivos."
            );
        }

        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularPagamento() {
        return horasTrabalhadas * valorHora;
    }

    public String getNome() {
        return nome;
    }
}