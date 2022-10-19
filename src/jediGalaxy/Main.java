package jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimestions = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int x = dimestions[0];
        int y = dimestions[1];

        Matrix matrix = new Matrix(x,y);

        String command = scanner.nextLine();
        long sum = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] PetarStartIndex = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] evilStartIndex = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int xE = evilStartIndex[0];
            int yE = evilStartIndex[1];

            while (xE >= 0 && yE >= 0) {
                if (xE >= 0 && xE < matrix.getMatrix().length && yE >= 0 && yE <matrix.getMatrix().length) {
                    matrix.getMatrix()[xE][yE] = 0;
                }
                xE--;
                yE--;
            }

            int xPetar = PetarStartIndex[0];
            int yPetar = PetarStartIndex[1];

            while (xPetar >= 0 && yPetar < matrix.getMatrix().length) {
                if (matrix.isInBounds(xPetar, yPetar)) {
                    sum += matrix.getMatrix()[xPetar][yPetar];
                    yPetar++;
                    xPetar--;
                }
            }

            command = scanner.nextLine();
        }

        System.out.println(sum);

    }
}
