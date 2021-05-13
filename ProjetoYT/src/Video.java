
public class Video implements AcoesVideo {

    // Atributos:
    private String titulo;
    private int avaliacao;
    private int views;
    private int likes;
    private int deslikes;
    private boolean reproduzindo;

    // Métodos:
    // Construtor:
    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.likes = 0;
        this.deslikes = 0;
        this.reproduzindo = false;
    }

    // Getters e Setters:
    public String toString() {
        return "\n titulo: " + titulo + "\n avaliacao: " + avaliacao + "\n views: " + views
                + "\n likes: " + likes + "\n deslikes: " + deslikes + "\n reproduzindo: " + reproduzindo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getAvaliacao() {
        return this.avaliacao;
    }

    public void setAvaliacao() {
        this.avaliacao = (getLikes() + getDeslikes()) /this.views;
    }

    public int getViews() {
        return this.views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return this.likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDeslikes() {
        return this.deslikes;
    }

    public void setDeslikes(int deslikes) {
        this.deslikes = deslikes;
    }

    public boolean isReproduzindo() {
        return this.reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
    // Outros Métodos:
    @Override
    public void play() {
        if (!isReproduzindo()) { // Se NÃO estiver reproduzindo
            setReproduzindo(true); // reproduzir
            System.out.println("Reproduzindo..");
        } else { // Senão
            pause(); // pausar video
        }
    }

    @Override
    public void pause() {
        if (isReproduzindo()) { // Se estiver reproduzindo
            setReproduzindo(false); // Pausar
            System.out.println("Pausado..");
        } else { //senão
            play(); // Reproduzir
        }
    }

    @Override
    public void like() {
        setLikes(getLikes() + 1);
    }

    @Override
    public void deslike() {
        setDeslikes(getDeslikes() + 1);
    }
}
