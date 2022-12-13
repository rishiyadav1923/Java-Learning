//* Java Code for using "this" as an argument in constructor call  */
//* Class with object of class B as its data number */

class argument_const {
    Keyword_this5 object;

    // Parameterized Constructor with object of B as a Parameter
    argument_const(Keyword_this5 object) {
        this.object = object;

        // Calling display method of class B
        object.display();
    }
}


public class Keyword_this5 {
    int x = 5;

    // Default constructor that creates a object of A
    // with passing this as an argument in the constructor

    Keyword_this5() {
        argument_const object = new argument_const (this);
    }

    // Method to show value of x
    void display() {
        System.out.println("Value of x in class B is : " + x);
    }

    public static void main(String[] args) {
        Keyword_this5 object = new Keyword_this5();
    }
    
}
