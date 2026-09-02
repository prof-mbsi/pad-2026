package aula2608;

import java.io.IOException;

public class ExemploException {

    public static void lerArquivo() throws IOException {
        System.out.println("Lendo arquivo...");
    }

    public static void main(String[] args) throws IOException {
        lerArquivo();
    }
}