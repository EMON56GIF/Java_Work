
//   import java.util.Scanner;

// class assignement {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();

//         boolean prime = true;

//         if (n <= 1) {
//             prime = false;
//         } else {
//             for (int i = 2; i <= n / 2; i++) {
//                 if (n % i == 0) {
//                     prime = false;
//                     break;
//                 }
//             }
//         }

//         if (prime)
//             System.out.println(n + " is a prime number.");
//         else
//             System.out.println(n + " is not a prime number.");

//         sc.close();
//     }
// }

// import java.util.Scanner;

// class assignment {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter first number: ");
//         int a = sc.nextInt();

//         System.out.print("Enter second number: ");
//         int b = sc.nextInt();

//         while (b != 0) {
//             int temp = b;
//             b = a % b;
//             a = temp;
//         }

//         System.out.println("GCD = " + a);

//         sc.close();
//     }
// }

// import java.util.Scanner;
// class assignment {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter first number: ");
//         int a = sc.nextInt();

//         System.out.print("Enter second number: ");
//         int b = sc.nextInt();

//         int x = a;
//         int y = b;

//         // Find GCD
//         while (y != 0) {
//             int temp = y;
//             y = x % y;
//             x = temp;
//         }

//         int gcd = x;
//         int lcm = (a * b) / gcd;

//         System.out.println("LCM = " + lcm);

//         sc.close();
//     }
// }

// class assignment {
//     public static void main(String[] args) {
//         int a_int = 1024;

//         long a_long = a_int;
//         System.out.println("Value of a_long = " + a_long);

//         short a_short = (short) a_int;
//         System.out.println("Value of a_short = " + a_short);

//         byte a_byte = (byte) a_int;
//         System.out.println("Value of a_byte = " + a_byte);
//     }
// }


class car{
    
}