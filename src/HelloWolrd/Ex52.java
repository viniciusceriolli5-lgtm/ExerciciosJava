package HelloWolrd;

import java.util.Scanner;

public class Ex52 {

    public static String removerEspacosDuplicados(String texto) {
        String resultado = "";

        for (int i = 0; i < texto.length(); i++) {
            char atual = texto.charAt(i);

            if (!(atual == ' ' && i > 0 && texto.charAt(i - 1) == ' ')) {
                resultado += atual;
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        System.out.println("Resultado: " + removerEspacosDuplicados(frase));

        sc.close();
    }
}