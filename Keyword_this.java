//* ‘this’ is a reference variable that refers to the current object.*/
//Java code for using 'this' keyword to
//refer current class instance variables
public class Keyword_this {

    int a;
    int b;

    // Parameterized Constructor
    Keyword_this(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void display() {
        // Displaying Value of Variables a & b
        System.out.println("a = " + a +  "b = " +b);
    }

    public static void main(String[] args) {
        Keyword_this obj = new Keyword_this(10, 20);
        obj.display();
    }
}
