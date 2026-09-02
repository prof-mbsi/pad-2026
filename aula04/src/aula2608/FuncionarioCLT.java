package aula2608;

public class FuncionarioCLT implements Pagavel {

    private String nome;
    private double salarioMensal;

    public FuncionarioCLT(String nome, double salarioMensal) {

        if (salarioMensal < 0) {
            throw new IllegalArgumentException(
                "O salário não pode ser negativo."
            );
        }

        this.nome = nome;
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularPagamento() {
        return salarioMensal;
    }
    
    public String getNome() {
    	return this.nome;
    }
}