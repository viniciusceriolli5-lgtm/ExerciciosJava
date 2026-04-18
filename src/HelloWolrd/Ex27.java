package HelloWolrd;

import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[8];
        int[] semDuplicados = new int[8];
        int tamanho = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            boolean existe = false;

            for (int j = 0; j < tamanho; j++) {
                if (numeros[i] == semDuplicados[j]) {
                    existe = true;
                    break;
                }
            }

            if (!existe) {
                semDuplicados[tamanho] = numeros[i];
                tamanho++;
            }
        }

        System.out.println("Array sem duplicados:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(semDuplicados[i] + " ");
        }

        sc.close();
    }
}