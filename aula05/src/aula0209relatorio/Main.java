package aula0209relatorio;

public class Main {

    public static void main(String[] args) {

        Exportador pdf = new ExportadorPDF();

        RelatorioService relatorioPDF =
                new RelatorioService(pdf);

        relatorioPDF.gerarRelatorio(
                "Relatório de vendas");

        System.out.println();

        Exportador excel = new ExportadorExcel();

        RelatorioService relatorioExcel =
                new RelatorioService(excel);

        relatorioExcel.gerarRelatorio(
                "Relatório de estoque");
    }
}