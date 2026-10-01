package practice2;

public class Main {
    static void main() {
        int a = 5;
        int b = 0;

        b = a++; // Постфіксний запис
        System.out.println("a = " + a + ", b = " + b);

        b = ++a; // Префіксний запис
        System.out.println("a = " + a + ", b = " + b);

        a = 10;

        b = a--; // Постфіксний запис
        System.out.println("a = " + a + ", b = " + b);

        b = --a; // Префіксний запис
        System.out.println("a = " + a + ", b = " + b);

        b = ++a;

        b = ++a;
        b = a++;

        a = 2;
        boolean result = (a == 2);
    }
}
