package HelloWolrd;

import java.util.Scanner;

public class Ex51 {

    public static boolean senhaForte(String senha) {
        if (senha.length() < 8) {
            return false;
        }

        boolean maiuscula = false;
        boolean minuscula = false;
        boolean numero = false;

        for (int i = 0; i < senha.length(); i++) {
            char c = senha.charAt(i);

            if (Character.isUpperCase(c)) {
                maiuscula = true;
            } else if (Character.isLowerCase(c)) {
                minuscula = true;
            } else if (Character.isDigit(c)) {
                numero = true;
            }
        }

        return maiuscula && minuscula && numero;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma senha: ");
        String senha = sc.nextLine();

        if (senhaForte(senha)) {
            System.out.println("Senha forte.");
        } else {
            System.out.println("Senha fraca.");
        }

        sc.close();
    }
}