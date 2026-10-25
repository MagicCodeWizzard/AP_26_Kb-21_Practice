package lections.arrays;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static void task1(Scanner scanner)
    {
        Random random = new Random();

        int[] array_a, array_b;
        int size_a, size_b;

        System.out.print("Введіть розмір масиву: ");
        size_a = scanner.nextInt();

        size_b = size_a * 2;

        array_a = new int[size_a];
        array_b = new int[size_b];

        for (int i = 0; i < array_a.length; ++i) {
            array_a[i] = random.nextInt(-10, 10);
        }

        System.out.printf("Згенерований масив: %s%n", Arrays.toString(array_a));

        for (int i = 0, j = 0; i < array_b.length; i += 2, j++) {
            array_b[i] = array_a[j];
        }

        System.out.printf("Етап 1 -> масив B: %s%n", Arrays.toString(array_b));

        for (int i = 1; i < array_b.length - 1; i += 2) {
            array_b[i] = (array_b[i - 1] + array_b[i + 1]) / 2;
        }

        System.out.printf("Етап 2 -> масив B: %s%n", Arrays.toString(array_b));
    }

    static void task2(Scanner scanner)
    {
        int[] array;
        int array_size, sum_even = 0, sum_odd = 0;

        Random random = new Random();

        System.out.print("Введіть розмір масиву: ");
        array_size = scanner.nextInt();

        array = new int[array_size];

        System.out.println("Введіть елементи масиву: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if ((i % 2) == 0) {
                sum_even += array[i];
            } else {
                sum_odd += array[i];
            }
        }

        System.out.printf("Сума парних: %d, непарних: %d%n", sum_even, sum_odd);
    }

    static void task3(Scanner s)
    {
        int[] array;
        Random random = new Random();
        int array_size;

        System.out.print("Введіть розмір масиву: ");
        array_size = s.nextInt();
        array = new int[array_size];
        for (int i = 0; array_size > i; i++) {
            array[i] = random.nextInt();
        }


        array = new int[array_size];







    }

    static void main() {
        Scanner scanner = new Scanner(System.in);

        //task1(scanner);
        //task2(scanner);
        task3(scanner);
    }
}
