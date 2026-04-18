package HelloWolrd;

import java.util.Scanner;

public class Ex42 {

    public static boolean validarCPF(String cpf) {
        if (cpf.length() != 11) {
            return false;
        }

        for (int i = 0; i < cpf.length(); i++) {
            if (!Character.isDigit(cpf.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o CPF com 11 números: ");
        String cpf = sc.nextLine();

        if (validarCPF(cpf)) {
            System.out.println("CPF válido (simplificado).");
        } else {
            System.out.println("CPF inválido.");
        }

        sc.close();
    }
}