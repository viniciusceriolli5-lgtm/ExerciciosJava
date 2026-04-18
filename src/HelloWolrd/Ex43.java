package HelloWolrd;

import java.util.Scanner;

public class Ex43 {

    public static int fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fatorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        System.out.println("Fatorial = " + fatorial(n));

        sc.close();
    }
}