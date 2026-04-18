package HelloWolrd;

import java.util.Random;
import java.util.Scanner;

public class Ex48 {

    public static String gerarSenha(int tamanho) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        String senha = "";

        for (int i = 0; i < tamanho; i++) {
            int indice = random.nextInt(caracteres.length());
            senha += caracteres.charAt(indice);
        }

        return senha;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho da senha: ");
        int tamanho = sc.nextInt();

        System.out.println("Senha gerada: " + gerarSenha(tamanho));

        sc.close();
    }
}