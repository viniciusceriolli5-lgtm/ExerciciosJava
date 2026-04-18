package HelloWolrd;

import java.util.Scanner;

public class Ex40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Dizer Olá");
            System.out.println("2 - Somar dois números");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Olá!");
                    break;
                case 2:
                    System.out.print("Digite o primeiro número: ");
                    double a = sc.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double b = sc.nextDouble();
                    System.out.println("Soma = " + (a + b));
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 3);

        sc.close();
    }
}