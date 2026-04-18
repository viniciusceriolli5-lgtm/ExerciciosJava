package HelloWolrd;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            double num = sc.nextDouble();
            soma += num;
        }

        double media = soma / 10;
        System.out.println("Média: " + media);

        sc.close();
    }
}