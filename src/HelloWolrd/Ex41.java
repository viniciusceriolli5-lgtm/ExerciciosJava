package HelloWolrd;

import java.util.Scanner;

public class Ex41 {

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: divisão por zero.");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        char op = sc.next().charAt(0);

        double resultado = 0;

        switch (op) {
            case '+':
                resultado = somar(n1, n2);
                break;
            case '-':
                resultado = subtrair(n1, n2);
                break;
            case '*':
                resultado = multiplicar(n1, n2);
                break;
            case '/':
                resultado = dividir(n1, n2);
                break;
            default:
                System.out.println("Operação inválida.");
                sc.close();
                return;
        }

        System.out.println("Resultado = " + resultado);
        sc.close();
    }
}