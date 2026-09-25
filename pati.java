import java.util.Scanner;

abstract class Vehicle { 
    private String brand; 

    public Vehicle(String brand) { 
        this.brand = brand; 
    } 

    public abstract void startEngine(); 

    public void honk() { 
        System.out.println(brand + " says: Beep Beep!!"); 
    } 
} 


class Car extends Vehicle { 
    public Car(String brand) { 
        super(brand); 
    } 

    @Override 
    public void startEngine() { 
        System.out.println("Turn key ignition: Spark plug fires, fuel injected."); 
    } 
} 


class ElectricScooter extends Vehicle {
    public ElectricScooter(String brand) {
        super(brand);
    }

    @Override 
    public void startEngine() { 
        System.out.println("Press start button: Lithium battery engaged, silent electric motor ready."); 
    } 
} 

public class pati {
    public static void main(String[] args) { 
        Vehicle myCar = new Car("Honda");
        Vehicle myScooter = new ElectricScooter("Ather");
        
        myCar.startEngine();
        myCar.honk();

        System.out.println(); 

        myScooter.startEngine();
        myScooter.honk();
    }
}
