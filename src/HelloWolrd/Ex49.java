package HelloWolrd;

import java.util.Scanner;

public class Ex49 {

    public static boolean ehPrimo(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        if (ehPrimo(num)) {
            System.out.println("É primo.");
        } else {
            System.out.println("Não é primo.");
        }

        sc.close();
    }
}