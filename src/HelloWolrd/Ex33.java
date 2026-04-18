package HelloWolrd;

import java.util.Random;

public class Ex33 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] frequencia = new int[6];

        for (int i = 0; i < 100; i++) {
            int dado = random.nextInt(6) + 1;
            frequencia[dado - 1]++;
        }

        for (int i = 0; i < frequencia.length; i++) {
            System.out.println("Face " + (i + 1) + ": " + frequencia[i] + " vezes");
        }
    }
}