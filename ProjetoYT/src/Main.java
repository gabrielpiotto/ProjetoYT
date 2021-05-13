
public class Main {

    public static void main(String[] args) {
        Video video[] = new Video[2];
        video[0] = new Video("Curso POO Java 14b");
        video[1] = new Video("Curso POO Java 15b");

        Gafanhoto gafanhoto[] = new Gafanhoto[2];
        gafanhoto[0] = new Gafanhoto("Guest1", 22, "M", "guest1");
        gafanhoto[1] = new Gafanhoto("Guest2", 22, "F", "guest2");

        Visualizacao v[] = new Visualizacao[4];
        v[0] = new Visualizacao(gafanhoto[0], video[0]); // Guest1 assiste aula 14b
        v[0].avaliar(4); // like
        System.out.println(v[0].toString());
        
        v[1] = new Visualizacao(gafanhoto[0], video[1]); // Guest1 assiste aula 15b
        v[1].avaliar(5); // like
        System.out.println(v[1].toString());
        
        v[2] = new Visualizacao(gafanhoto[1], video[0]); // Guest2 assiste aula 14b
        v[2].avaliar(6); // like
        System.out.println(v[2].toString());
        
        v[3] = new Visualizacao(gafanhoto[1], video[1]); // Guest2 assite aula 15b
        v[3].avaliar(10); // deslike
        System.out.println(v[3].toString());
    }
}
