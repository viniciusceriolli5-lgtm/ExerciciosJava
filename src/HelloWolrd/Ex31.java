package HelloWolrd;

import java.util.Random;
import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int palpite;

        do {
            System.out.print("Tente adivinhar o número (1 a 100): ");
            palpite = sc.nextInt();

            if (palpite < numeroSecreto) {
                System.out.println("Muito baixo!");
            } else if (palpite > numeroSecreto) {
                System.out.println("Muito alto!");
            } else {
                System.out.println("Parabéns, você acertou!");
            }

        } while (palpite != numeroSecreto);

        sc.close();
    }
}