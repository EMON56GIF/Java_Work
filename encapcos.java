import java.util.Scanner;

class Student{

    private String name;
    private int marks;

   Student(String name, int marks){

        this.name= name;
        this.marks=marks;
   }

    String getName(){

        return name;
    }


    int getMarks(){

        return marks;
    }
}

public class encapcos{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
            

            System.out.print("Enter student name:");
            String name=sc.nextLine();

            System.out.print("Enter marks:");
            int marks = sc.nextInt();

             Student s= new Student(name,marks);

            System.out.println("\n STUDENT DETAILS ARE");
            System.out.println("Name: "+s.getName());
            System.out.println("Marks: " +s.getMarks());
        }



    }

