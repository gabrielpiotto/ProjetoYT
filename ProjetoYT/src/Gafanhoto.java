
public class Gafanhoto extends Pessoa {

    // Atributos:
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    // Métodos:
    // Getters e Setters
    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return this.totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() +"\n login: " + login + "\n totAssistido: " + totAssistido;
    }

    /**
     * Ver mais um video
     */
    public void viuMaisUm() {
    }

}
