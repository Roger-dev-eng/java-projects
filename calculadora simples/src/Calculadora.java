import java.util.Scanner;

public class Calculadora {
    public static float somar(float n1, float n2) {
        return n1+n2;
    }

    public static float subtrair(float n1, float n2) {
        return n1-n2;
    }

    public static float multiplicar(float n1, float n2) {
        return n1*n2;
    }

    public static float dividir(float n1, float n2) {
        return n1/n2;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu de escolhas: ");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            if (opcao >=1 && opcao <=4){
                System.out.print("Digite o primeiro número: ");
                float n1 = scanner.nextFloat();

                System.out.print("Digite o segundo número: ");
                float n2 = scanner.nextFloat();

                float resultado = 0;

                switch (opcao) {
                   case 1:
                        resultado = somar(n1,n2);
                        break;
                   case 2:
                        resultado = subtrair(n1,n2);
                        break;
                    case 3:
                        resultado = multiplicar(n1,n2);
                        break;
                    case 4:
                        resultado = dividir(n1,n2);
                        break;
               }
               System.out.println("Resultado:" + resultado);
            }
        } while(opcao != 0);

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}
