class car {

    String name;
    String model;
    String engine;

    void display() {

    System.out.println("Brand of car is:" + name);
    System.out.println("Model of car is:" + model);
    System.out.println("Brand of car is:" + engine);
    }
}



public class Main {
    public static void main(String[] args) {

        car c1 = new car();

        c1.name = "BURUMM";
        c1.model = "dhoom";
        c1.engine = "v16";

        c1.display();
    }

}
