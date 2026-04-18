package HelloWolrd;

import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número decimal: ");
        int numero = sc.nextInt();

        String binario = "";

        if (numero == 0) {
            binario = "0";
        } else {
            while (numero > 0) {
                binario = (numero % 2) + binario;
                numero = numero / 2;
            }
        }

        System.out.println("Binário: " + binario);

        sc.close();
    }
}