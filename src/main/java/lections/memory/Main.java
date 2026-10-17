package lections.memory;

import java.util.Scanner;

public class Main {

    //    static void someFunction()
//    {
//        System.out.println("Викличено функцію someFunction");
//
//        main();
//    }

    static void nullPointerExample()
    {
        Scanner myScanner = null;

        processUserInput(myScanner);
    }


    static void main() {
        System.out.println("Викличено функцію main");

        int a = 4;

        nullPointerExample();

//        someFunction();
    }

    static void processUserInput(Scanner scanner)
    {
        if (scanner != null) {
            System.out.printf("Данні користувача: %s",
                              scanner.nextLine());
        } else {
            System.out.println("Не ініціалізовано!");
        }
    }
}
