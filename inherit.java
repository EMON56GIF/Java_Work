import java.util.Scanner;

class car {
    String brand;
    int price;

    void displaycar() {
        // Added missing quotation marks
        System.out.println("Brand of the car is: " + brand);
        System.out.println("Price of the car is: " + price);
    }
}

class Sportscar extends car {
    int speed;

    void displaySpeed() {
        // Added missing quotation marks
        System.out.println("Maximum speed is: " + speed + " km/hr");
    }
}

class Hypercar extends Sportscar {
    String engine;

    void displayengine() {
        // Added missing quotation marks
        System.out.println("Engine model is: " + engine);
    }
}

public class inherit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Use only one object since Hypercar inherits everything from car and Sportscar
        Hypercar carr = new Hypercar();

        System.out.print("Enter the brand name: ");
        carr.brand = sc.nextLine();

        System.out.print("Enter the car price: ");
        carr.price = sc.nextInt();

        System.out.print("Enter the car speed: ");
        carr.speed = sc.nextInt();
        
        // Consume the leftover newline character from nextInt() so nextLine() works properly
        sc.nextLine(); 

        System.out.print("Enter the car engine: ");
        carr.engine = sc.nextLine();

        System.out.println("\nCar details:");
        carr.displaycar();
        carr.displaySpeed();
        carr.displayengine();

        sc.close();
    }
}
