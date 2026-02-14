import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        float saldo = 1000;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Depositar Valor");
            System.out.println("3 - Sacar Valor");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(saldo);
                    break;
                case 2:
                    System.out.print("Deposite um valor: ");
                    float deposito = scanner.nextFloat();
                    if (deposito<0) {
                        System.out.print("Digite um número positivo!");
                        break;
                    }
                    saldo+=deposito;
                    break;
                case 3:
                    System.out.print("Saque um valor: ");
                    float saque = scanner.nextFloat();
                    if (saque>saldo) {
                        System.out.print("Saldo insuficiente!");
                        break;
                    }
                    else if (saque>0) {
                        saldo-=saque;
                    }
                    else {
                        System.out.print("Digite um número positivo!");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}