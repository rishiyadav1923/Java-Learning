/*Scope of a variable is the part of the program where the variable is accessible. Like C/C++, in Java, all identifiers are lexically (or statically)
scoped, i.e.scope of a variable can determined at compile time and independent of function call stack. 
Java programs are organized in the form of classes. Every class is part of some package. Java scope rules can be covered under following categories.

Member Variables (Class Level Scope)

These variables must be declared inside class (outside any function). They can be directly accessed anywhere in class. Let’s take a look at an example: 

public class Test
{
    // All variables defined directly inside a class 
    // are member variables
    int a;
    private String b;
    void method1() {....}
    int method2() {....}
    char c;
}
We can declare class variables anywhere in class, but outside methods.
Access specified of member variables doesn’t affect scope of them within a class.
Member variables can be accessed outside a class with following rules
Modifier      Package  Subclass  World

public          Yes      Yes     Yes

protected       Yes      Yes     No

Default (no
modifier)       Yes       No     No

private         No        No     No
Local Variables (Method Level Scope)


Variables declared inside a method have method level scope and can’t be accessed outside the method. 

public class Test
{
    void method1() 
    {
       // Local variable (Method level scope)
       int x;
    }
}
Note : Local variables don’t exist after method’s execution is over. 

Here’s another example of method scope, except this time the variable got passed in as a parameter to the method: 

class Test
{
    private int x;
    public void setX(int x)
    {
        this.x = x;
    }
}
The above code uses this keyword to differentiate between the local and class variables.

As an exercise, predict the output of following Java program.  

*/

public class Scope_of_variables {
    static int x = 11;
    private int y = 33;
    public void method1(int x)
    {
        Scope_of_variables t = new Scope_of_variables();
        this.x = 22;
        y = 44;
 
        System.out.println("Test.x: " + Scope_of_variables.x);
        System.out.println("t.x: " + t.x);
        System.out.println("t.y: " + t.y);
        System.out.println("y: " + y);
    }

    public static void main(String args[])
    {
        Scope_of_variables t = new Scope_of_variables();
        t.method1(5);
    }
}
