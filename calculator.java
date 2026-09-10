
import java.util.Scanner;

class calc {
    int a;
    int b;

    void add() {
        System.out.println("Addition is: " + (a + b));
    }

    void modulus() {
        System.out.println("Modulus is: " + (a % b));
    }

    void subtract() {
        System.out.println("Subtraction is: " + (a - b));
    }

    void division() {
        System.out.println("Division is: " + (a / b));
    }
}

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        calc c1 = new calc();

        System.out.print("Enter value for a: ");
        c1.a = scanner.nextInt();

        System.out.print("Enter value for b: ");
        c1.b = scanner.nextInt();

        c1.add();
        c1.subtract();
        c1.modulus();
        c1.division();

        scanner.close();
    }
}
