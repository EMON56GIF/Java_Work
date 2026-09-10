 class rec {
    
    int  length;
    int  breath;

    void display(){

       System.out.println("Area of the rectangle:" + (length*breath));
    }
}


public class rectangle {
    public static void main(String[] args) {

       rec r1  = new rec();

        r1.length = 10;
        r1.breath = 20;
        

        r1.display();
    }

}