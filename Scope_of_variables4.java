// From previous knowledge lets check what will be the answer of the following type

public class Scope_of_variables4 {
    public static void main(String args[])
    {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        int i = 20;
        System.out.println(i);
    }
}

// Yes, it will run!
// See the program carefully, inner loop will terminate before the outer loop variable is declared.So the inner loop variable is destroyed first and then the
// new variable of same name has been created.

// * Some Important Points about Variable scope in Java:

// 1.) In general, a set of curly brackets { } defines a scope.
// 2.) In Java we can usually access a variable as long as it was defined within the same set of brackets as the code we are writing or within any curly
//     brackets inside of the curly brackets where the variable was defined.
// 3.) Any variable defined in a class outside of any method can be used by all member methods.
// 4.) When a method has the same local variable as a member, “this” keyword can be used to reference the current class variable.
// 5.) For a variable to be read after the termination of a loop, It must be declared before the body of the loop.


