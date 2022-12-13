//* Using "this" Keyword to return the current class instance */
// Java Code for using "this" to return current class instance

public class Keyword_this2 {

    int a;
    int b;

    // Default Constructor
    Keyword_this2() {
        a = 10;
        b = 20;
    }

    // Method that return current class instance
    Keyword_this2 get() {
        return this;
    }

    // Displaying Value of Variables a & b
    void display() {
        System.out.println("a = " + a + "b = " + b);
    }

    public static void main(String[] args) {
        Keyword_this2 object = new Keyword_this2();
        object.get().display();
    }
}
