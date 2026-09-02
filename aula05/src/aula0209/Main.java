package aula0209;

public class Main {

    public static void main(String[] args) {

        Pagamento cartao = new Cartao();
        CompraService compraCartao = new CompraService(cartao);

        compraCartao.finalizarCompra(150);

        Pagamento pix = new Pix();
        CompraService compraPix = new CompraService(pix);

        compraPix.finalizarCompra(200);
        
        Pagamento boleto = new Boleto();

        CompraService compraBoleto =
                new CompraService(boleto);

        compraBoleto.finalizarCompra(300);
    }
}