package aula0209relatorio;

public class ExportadorPDF implements Exportador {

    @Override
    public void exportar(String conteudo) {
        System.out.println("Exportando PDF:");
        System.out.println(conteudo);
    }
}