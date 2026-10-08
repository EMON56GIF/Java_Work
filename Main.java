import java.util.Scanner;

class Car {
    void display() {
        System.out.println("This is a car.");
    }
}

class ElectricCar extends Car {
    @Override
    void display() {
        System.out.println("This is an Electric Car.");
    }
}

class PetrolCar extends Car {
    @Override
    void display() {
        System.out.println("This is a Petrol Car.");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter car type (electric/petrol): ");
        String type = sc.nextLine();
        
        Car car;
        if (type.equalsIgnoreCase("electric")) {
            car = new ElectricCar();
        } else {
            car = new PetrolCar();
        }
        
        car.display();
        sc.close();
    }
}
