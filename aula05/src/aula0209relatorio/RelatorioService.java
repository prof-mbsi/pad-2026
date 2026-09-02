package aula0209relatorio;

public class RelatorioService {

    private Exportador exportador;

    public RelatorioService(Exportador exportador) {
        this.exportador = exportador;
    }

    public void gerarRelatorio(String conteudo) {
        exportador.exportar(conteudo);
    }
}