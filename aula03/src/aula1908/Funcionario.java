package aula1908;

public class Funcionario {

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularBonus() {
        return salario * 0.05;
    }

    public void exibirDados() {
        System.out.println(nome + " - R$ " + salario);
    }
}