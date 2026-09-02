package aula0209relatorio;

public class ExportadorExcel implements Exportador {

    @Override
    public void exportar(String conteudo) {
        System.out.println("Exportando Excel:");
        System.out.println(conteudo);
    }
}