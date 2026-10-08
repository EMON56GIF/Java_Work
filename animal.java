 import java.util.Scanner;

class Animall {
    void makesound() {
        System.out.println("This animal make sound.");
    }
}

class Lion extends Animall {
    @Override
    void makesound() {
        System.out.println("This is an Lion sound.");
    }
}

class Tiger extends Animall {
    @Override
    void makesound() {
        System.out.println("This is a Tiger sound .");
    }
}

public class animal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter animal type (lion/tiger): ");
        String type = sc.nextLine();
        
        Animall animall;
        if (type.equalsIgnoreCase("lion")) {
            animall = new Lion();
        } else {
            animall = new Tiger();
        }
        
        animall.makesound();
        sc.close();
    }
}
 
    

