
public class Visualizacao {

    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao:" + espectador.toString() + "\n" + "\n Video: " + filme.toString();
    }

    public void avaliar(int nota) {
        if (nota >= 5) {
            this.filme.setLikes(this.filme.getLikes() + 1);
        } else {
            this.filme.setDeslikes(this.filme.getDeslikes() + 1);
        }
    }
}
