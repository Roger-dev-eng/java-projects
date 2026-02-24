package Alunos;

public class Aluno {
    String nome;
    int idade;
    float nota1;
    float nota2;
    float mediafinal;

    public Aluno(String nome, int idade, float nota1, float nota2) {
        this.nome = nome;
        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public void media() {
        mediafinal = ((nota1 + nota2) / 2);
    }

    public void exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Primeira nota: " + nota1);
        System.out.println("Segunda nota: " + nota2);
        System.out.println("Média: " + mediafinal);
    }
}
