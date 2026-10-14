package aula1609;

public class ConfiguracaoSistema {

    private static ConfiguracaoSistema instance;

    private String tema;

    private ConfiguracaoSistema() {
        tema = "Light Mode";
    }

    /*Tornando o método thread-safe: */
    public static synchronized
            ConfiguracaoSistema getInstance() {

        if (instance == null) {
            instance =
                    new ConfiguracaoSistema();
        }

        return instance;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}