//* Using "this" to invoke Current class Constructor*/
// Java code to invoke current class Constructor
public class Keyword_this1 {
    int a;
    int b;
 
    //Default constructor
    Keyword_this1()
    { 
        this(10, 20);
        System.out.println("Inside  default constructor \n");
    }
     
    //Parameterized constructor
    Keyword_this1(int a, int b)
    {
        this.a = a;
        this.b = b;
        System.out.println("Inside parameterized constructor");
    }

    // Driver Class
    public static void main(String[] args) {
        Keyword_this1 object = new Keyword_this1();

    }
}
