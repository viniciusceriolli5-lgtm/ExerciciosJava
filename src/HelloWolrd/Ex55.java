package HelloWolrd;

import java.util.Scanner;

public class Ex55 {

    public static void mostrarTabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean verificarVencedor(char[][] t, char jogador) {
        for (int i = 0; i < 3; i++) {
            if (t[i][0] == jogador && t[i][1] == jogador && t[i][2] == jogador) {
                return true;
            }
            if (t[0][i] == jogador && t[1][i] == jogador && t[2][i] == jogador) {
                return true;
            }
        }

        if (t[0][0] == jogador && t[1][1] == jogador && t[2][2] == jogador) {
            return true;
        }

        if (t[0][2] == jogador && t[1][1] == jogador && t[2][0] == jogador) {
            return true;
        }

        return false;
    }

    public static boolean tabuleiroCheio(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] tabuleiro = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
        };

        char jogador = 'X';

        while (true) {
            mostrarTabuleiro(tabuleiro);

            System.out.println("Jogador " + jogador);
            System.out.print("Digite a linha (0, 1, 2): ");
            int linha = sc.nextInt();
            System.out.print("Digite a coluna (0, 1, 2): ");
            int coluna = sc.nextInt();

            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
                System.out.println("Posição inválida.");
                continue;
            }

            if (tabuleiro[linha][coluna] != '-') {
                System.out.println("Posição já ocupada.");
                continue;
            }

            tabuleiro[linha][coluna] = jogador;

            if (verificarVencedor(tabuleiro, jogador)) {
                mostrarTabuleiro(tabuleiro);
                System.out.println("Jogador " + jogador + " venceu!");
                break;
            }

            if (tabuleiroCheio(tabuleiro)) {
                mostrarTabuleiro(tabuleiro);
                System.out.println("Empate!");
                break;
            }

            if (jogador == 'X') {
                jogador = 'O';
            } else {
                jogador = 'X';
            }
        }

        sc.close();
    }
}