package aula0209;

public class CompraService {

    private Pagamento pagamento;

    public CompraService(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void finalizarCompra(double valor) {
        pagamento.pagar(valor);
    }
}