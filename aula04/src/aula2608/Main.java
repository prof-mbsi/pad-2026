package aula2608;

public class Main {

    public static void main(String[] args) {

        try {

            Pagavel[] pagamentos = {
                new FuncionarioCLT("Maria", 4500),
                new Freelancer("João", 20, 90),
                new Freelancer("Pedro", -10, 80)
            };

            for (Pagavel p : pagamentos) {
                System.out.println(
                    "Pagamento: R$ " +
                    p.calcularPagamento()
                );
            }

        } catch (IllegalArgumentException e) {
            System.out.println(
                "Erro: " + e.getMessage()
            );
        }
    }
}