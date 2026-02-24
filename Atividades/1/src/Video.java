package src;
public class Video {
    String titulo;
    int duracao;
    boolean estaDandoPlay;

    public Video (String titulo, int duracao, boolean estaDandoPlay) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.estaDandoPlay = estaDandoPlay;
    }

    public void alternarPlay() {
        this.estaDandoPlay = !estaDandoPlay;
    }

    public void info() {
        System.out.println("Título: " + titulo);
        System.out.println("Duração: " + duracao);
        System.out.println("Estar dando play: " + estaDandoPlay);
    }

}
