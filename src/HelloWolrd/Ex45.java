package HelloWolrd;

import java.util.Scanner;

public class Ex45 {

    public static int buscaBinaria(int[] array, int valor) {
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (array[meio] == valor) {
                return meio;
            } else if (valor < array[meio]) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = {2, 4, 6, 8, 10, 12, 14, 16};

        System.out.print("Digite o número que deseja buscar: ");
        int valor = sc.nextInt();

        int posicao = buscaBinaria(numeros, valor);

        if (posicao != -1) {
            System.out.println("Número encontrado na posição: " + posicao);
        } else {
            System.out.println("Número não encontrado.");
        }

        sc.close();
    }
}