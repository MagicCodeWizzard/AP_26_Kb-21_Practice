package practice4;

import com.sun.source.doctree.EscapeTree;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner s = new Scanner(System.in);

        boolean value = s.nextBoolean();

        if(value == true) {
            System.out.println("True condition!!!");
        } else {
            System.out.println("False condition!!!");
        }
    }
}
