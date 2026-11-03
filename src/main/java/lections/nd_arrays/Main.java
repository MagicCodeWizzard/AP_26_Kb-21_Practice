package lections.nd_arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[][] my_array;

        int row_size = 0;
        int col_size = 0;

        System.out.print("Введіть кількість рядків: ");
        row_size = scanner.nextInt();
        scanner.nextLine();

        my_array = new int[row_size][];

        for (int i = 0; i < my_array.length; i++) {
            System.out.printf("Введіть кількість елементів для рядка %d: ", i);
            col_size = scanner.nextInt();
            scanner.nextLine();

            my_array[i] = new int[col_size];

            for (int j = 0; j < my_array[i].length; j++) {
                my_array[i][j] = random.nextInt(-1000, 1000);
            }
        }

        System.out.println("Згенерований масив:");
        for (int[] row : my_array) {
            System.out.println(Arrays.toString(row));
        }
    }
}
