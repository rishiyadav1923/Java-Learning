//* Java code for using "this" keyword as Method Parameter */

public class Keyword_this3 {
    int a;
    int b;

    // Default Constructor
    Keyword_this3() {
        a = 10;
        b = 20;
    }

    // Method that receives "this" Keyword as a Parameter
    void display(Keyword_this3 object) {
        System.out.println("a = " + object.a + "b = " + object.b);
    }

    // Method that returns current class interface
    void get() {
        display(this);
    }

    // Driver Class
    public static void main(String[] args) {
        Keyword_this3 object = new Keyword_this3();
        object.get();
    }
}
