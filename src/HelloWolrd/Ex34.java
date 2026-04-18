package HelloWolrd;

import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String texto = sc.nextLine();

        for (int i = 0; i < texto.length(); i++) {
            char atual = texto.charAt(i);
            int contador = 0;
            boolean jaContou = false;

            for (int k = 0; k < i; k++) {
                if (texto.charAt(k) == atual) {
                    jaContou = true;
                    break;
                }
            }

            if (!jaContou) {
                for (int j = 0; j < texto.length(); j++) {
                    if (texto.charAt(j) == atual) {
                        contador++;
                    }
                }
                System.out.println(atual + ": " + contador);
            }
        }

        sc.close();
    }
}