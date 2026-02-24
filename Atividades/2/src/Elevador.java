package src;
public class Elevador {
    int andarAtual;
    int totalAndares;

    public Elevador (int andarAtual, int totalAndares) {
        this.totalAndares = totalAndares;
        this.andarAtual = andarAtual;
    }

    public void subir() {
        if (andarAtual < totalAndares)
            System.out.println("Subindo...");
        else
            System.out.println("Não é possível subir");
    }
}