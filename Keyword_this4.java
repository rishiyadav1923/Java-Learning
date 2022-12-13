//* Java Function to invoke current class Function */

public class Keyword_this4 {

    void display() {
        // Calling Function show()
        this.show();
        System.out.println("Inside Display Function");
    }

    void show() {
        System.out.println("Inside Show Function");
    }

    public static void main(String[] args) {
        Keyword_this4 object = new Keyword_this4();
        object.display();
    }

}
