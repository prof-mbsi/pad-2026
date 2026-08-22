package aula1908;

public class Main {

	public static void main(String[] args) {

        Funcionario f1 =
                new Desenvolvedor("João", 5000);

        Funcionario f2 =
                new Gerente("Maria", 8000);

        System.out.println(
                "Bônus João: R$ " +
                f1.calcularBonus()
        );

        System.out.println(
                "Bônus Maria: R$ " +
                f2.calcularBonus()
        );
        
        Funcionario[] funcionarios = new Funcionario[4];
        
        funcionarios[0] = new Desenvolvedor("João", 5000);
        funcionarios[1] = new Gerente("Maria", 8000);
        funcionarios[2] = new Desenvolvedor("Pedro", 4500);
        funcionarios[3] = new Gerente("Ana", 9000);
        for (Funcionario funcionario : funcionarios) {
        	System.out.println( funcionario.nome + " -> bônus: R$ " + funcionario.calcularBonus());
        }
    }
}