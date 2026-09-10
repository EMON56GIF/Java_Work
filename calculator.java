 class calc {
 int a;
 int b;
 
void add(){
    System.out.println("Addition is:" +(a+b) );
 }
void modulus(){
    System.out.println("Modulus is:" + (a%b));
}
void subtract(){
    System.out.println("Subtraction is:" + (a-b));
}
void division(){
    System.out.println("Divison is:" + (a/b));
 }
}
public class calculator {
    public static void main(String[] args) {
        
        calc c1 = new calc();
        
        c1.a= 10;
        c1.b=5;

        c1.add();
        c1.subtract();
        c1.modulus();
        c1.division();
    }
}

