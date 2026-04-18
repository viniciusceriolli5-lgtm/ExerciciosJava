package HelloWolrd;

import java.util.Scanner;

public class Ex53 {

    public static double calcular(double a, char op, double b) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    System.out.println("Erro: divisão por zero.");
                    return 0;
                }
                return a / b;
            default:
                System.out.println("Operador inválido.");
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma expressão (ex: 10 + 5): ");
        double a = sc.nextDouble();
        char op = sc.next().charAt(0);
        double b = sc.nextDouble();

        double resultado = calcular(a, op, b);

        System.out.println("Resultado = " + resultado);

        sc.close();
    }
}