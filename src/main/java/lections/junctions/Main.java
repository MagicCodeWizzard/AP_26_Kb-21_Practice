package lections.junctions;

import java.util.Scanner;

public class Main  {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть прізвище:" );
        String name = scanner.nextLine();
        System.out.println("Введене значення: " +name);
        if (name.compareTo("Петренко") == 0) {
           System.out.println("123");

        } else if (name.compareTo("Неклюдов") == 0) {
            System.out.println("321");
        }
    }
}
