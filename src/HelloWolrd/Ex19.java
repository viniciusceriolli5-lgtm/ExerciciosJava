package HelloWolrd;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos termos da sequência Fibonacci você quer ver? ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        System.out.print("Sequência: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int proximo = a + b;
            a = b;
            b = proximo;
        }

        sc.close();
    }
}