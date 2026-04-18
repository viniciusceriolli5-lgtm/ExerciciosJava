package HelloWolrd;

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }

        int maior = Integer.MIN_VALUE;
        int segundoMaior = Integer.MIN_VALUE;

        for (int num : numeros) {
            if (num > maior) {
                segundoMaior = maior;
                maior = num;
            } else if (num > segundoMaior && num != maior) {
                segundoMaior = num;
            }
        }

        System.out.println("Maior: " + maior);
        System.out.println("Segundo maior: " + segundoMaior);

        sc.close();
    }
}