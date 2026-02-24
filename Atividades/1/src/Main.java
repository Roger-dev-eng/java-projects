package src;
public class Main {
    public static void main(String[] args) {
        Video video1 = new Video("Teste", 12, false);
        video1.alternarPlay();
        video1.info();

        Video video2 = new Video("Teste1", 24, true);
        video2.alternarPlay();
        video2.info();
    }
}
