package HelloWolrd;

import java.util.Scanner;

public class Ex54 {

    public static boolean login(String usuario, String senha) {
        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";

        return usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Usuário: ");
        String usuario = sc.nextLine();

        System.out.print("Senha: ");
        String senha = sc.nextLine();

        if (login(usuario, senha)) {
            System.out.println("Login realizado com sucesso.");
        } else {
            System.out.println("Usuário ou senha incorretos.");
        }

        sc.close();
    }
}