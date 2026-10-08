import  java.util.Scanner;

class Calculator{

void add(int a, int b){

    System.out.println("Sum = "+(a+b));
}

void add(int a, int b,int c){

    System.out.println("Sum = " + (a+b+c));
}



void add(double a, double b){

    System.out.println("Sum = "+ (a+b));
}
}
public class poly{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Calculator obj = new Calculator();

        System.out.print("Enter 1st integer: ");
        int a = sc.nextInt();

        
        System.out.print("Enter 2nd integer: ");
        int b = sc.nextInt();
        
        obj.add(a,b);

        System.out.print("Enter 3rd integer: ");
         int c = sc.nextInt();

         obj.add(a,b,c);

         System.out.println("Enter 2 decimal numbers: ");
         double x = sc.nextDouble();
         double y = sc.nextDouble();

         obj.add(x,y);

    }
}