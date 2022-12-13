//* Variable in Java :-
// Variable in Java is a data container that saves the data values during Java program execution. Every variable is assigned a data type that designates
// the type and quantity of value it can hold. A variable is a memory location name for the data.

// A variable is a name given to a memory location. It is the basic unit of storage in a program.

// 1.) The value stored in a variable can be changed during program execution.
// 2.) A variable is only a name given to a memory location. All the operations done on the variable affect that memory location.
// 3.) In Java, all variables must be declared before use.

//* How to Declare Variables?
// Syntax : (type) -> int (name/variable) -> count;

//* 1. datatype: Type of data that can be stored in this variable.

//* 2. data_name: Name given to the variable. 

// In this way, a name can only be given to a memory location. It can be assigned values in two ways: 

// 1.) Variable Initialization
// 2.) Assigning value by taking input
// 3.) How to initialize variables?

// It can be perceived with the help of 3 components that are as follows:
// 1.) datatype: Type of data that can be stored in this variable.
// 2.) variable_name: Name given to the variable.
// 3.) value: It is the initial value stored in the variable.

//          int age = 20;
//           /   \      \
//         /      \      \
//   Datatype  variable   Value
//               Name

//* Types of Variables in Java
// Now let us discuss different types of variables which are listed as follows: 

// a.) Local Variables
// b.) Instance Variables
// c.) Static Variables

//*-> 1. Local Variables
// 1.) A variable defined within a block or method or constructor is called a local variable.
// 2.) These variables are created when the block is entered, or the function is called and destroyed after exiting from the block or when the call returns from the function.
// 3.) The scope of these variables exists only within the block in which the variables are declared, i.e., we can access these variables only within that block.
// 4.) Initialization of the local variable is mandatory before using it in the defined scope.

//*-> 2. Instance Variables
// 1.) Instance variables are non-static variables and are declared in a class outside of any method, constructor, or block. 
// 2.) As instance variables are declared in a class, these variables are created when an object of the class is created and destroyed when the object is destroyed.
// 3.) Unlike local variables, we may use access specifiers for instance variables. If we do not specify any access specifier, then the default access specifier will be used.
// 4.) Initialization of an instance variable is not mandatory. Its default value is 0.
// 5.) Instance variables can be accessed only by creating objects.

//*-> 3. Static Variables
// 1.) Static variables are also known as class variables.
// 2.) These variables are declared similarly as instance variables. The difference is that static variables are declared using the static keyword within a class outside of any method, constructor or block.
// 3.) Unlike instance variables, we can only have one copy of a static variable per class, irrespective of how many objects we create.
// 4.) Static variables are created at the start of program execution and destroyed automatically when execution ends.
// 5.) Initialization of a static variable is not mandatory. Its default value is 0.
// 6.) If we access a static variable like an instance variable (through an object), the compiler will show a warning message, which won’t halt the program. The compiler will replace the object name with the class name automatically.
// 7.) If we access a static variable without the class name, the compiler will automatically append the class name.

//*-> Differences between the Instance variables and the Static variables
// Now let us discuss the differences between the Instance variables and the Static variables:
// 1.) Each object will have its own copy of an instance variable, whereas we can only have one copy of a static variable per class, irrespective of how many objects we create.
// 2.) Changes made in an instance variable using one object will not be reflected in other objects as each object has its own copy of the instance variable. In the case of a static variable, changes will be reflected in other objects as static variables are common to all objects of a class.
// 3.) We can access instance variables through object references, and static variables can be accessed directly using the class name.

//* Rules for Variable Declaration :- */
// 1.) A variable name can consist of Capital letters A-Z, lowercase letters a-z digits 0-9, and two special characters such as _ underscore and $ dollar sign.
// 2.) The first character must not be a digit.
// 3.) Blank spaces cannot be used in variable names.
// 4.) Java keywords cannot be used as variable names.
// 5.) Variable names are case-sensitive.
// 6.) There is no limit on the length of a variable name but by convention, it should be between 4 to 15 chars.
// 7.) Variable names always should exist on the left-hand side of assignment operators.

//* <<------------------ Scope of Variables ------------------------> */
// Scope of a variable is the part of the program where the variable is accessible. Like C/C++, in Java, all identifiers are lexically (or statically)
// scoped, i.e.scope of a variable can determined at compile time and independent of function call stack.
// Java programs are organized in the form of classes. Every class is part of some package. Java scope rules can be covered under following categories.

//* Member Variables (Class Level Scope)
// These variables must be declared inside class (outside any function). They can be directly accessed anywhere in class. Let’s take a look at an example: 

// public class Test
// {
    // All variables defined directly inside a class 
    // are member variables
//  int a;
//  private String b;
//  void method1() {....}
//  int method2() {....}
//  char c;
// }

// We can declare class variables anywhere in class, but outside methods.
// Access specified of member variables doesn’t affect scope of them within a class.
// Member variables can be accessed outside a class with following rules

// Modifier                 Package  Subclass  World

// public                     Yes      Yes     Yes

// protected                  Yes      Yes     No

// Default (no modifier)      Yes       No     No

// private                    No        No     No

//* Local Variables (Method Level Scope)
// Variables declared inside a method have method level scope and can’t be accessed outside the method.

// public class Test
// {
//     void method1()
//     {
        // Local variable (Method level scope)
//        int x;
//     }
// }

//*-> Note : Local variables don’t exist after method’s execution is over.

// Here’s another example of method scope, except this time the variable got passed in as a parameter to the method:

// class Test
// {
//     private int x;
//     public void setX(int x)
//     {
//         this.x = x;
//     }
// }

// The above code uses this keyword to differentiate between the local and class variables.
// As an exercise, predict the output of following Java program.

// public class Test
// {
//     static int x = 11;
//     private int y = 33;
//     public void method1(int x)
//     {
//         Test t = new Test();
//         this.x = 22;
//         y = 44;

//         System.out.println("Test.x: " + Test.x);
//         System.out.println("t.x: " + t.x);
//         System.out.println("t.y: " + t.y);
//         System.out.println("y: " + y);
//     }

//     public static void main(String args[])
//     {
//         Test t = new Test();
//         t.method1(5);
//     }
// }

// Output:

// Test.x: 22
// t.x: 22
// t.y: 33
// y: 44

//* Loop Variables (Block Scope) */
// A variable declared inside pair of brackets “{” and “}” in a method has scope within the brackets only.

// public class Test
// {
//     public static void main(String args[])
//     {
//         {
            // The variable x has scope within
            // brackets
//             int x = 10;
//             System.out.println(x);
//         }

        // Uncommenting below line would produce
        // error since variable x is out of scope.

        // System.out.println(x);
//     }
// }

// Output:
// 10


// As another example, consider following program with a for loop. 

// class Test
// {
//     public static void main(String args[])
//     {
//         for (int x = 0; x < 4; x++)
//         {
//             System.out.println(x);
//         }

         // Will produce error
//         System.out.println(x);
//     }
// }

// Output:
// 11: error: cannot find symbol  System.out.println(x);


// The right way of doing above is,
// Above program after correcting the error
// class Test
// {
//     public static void main(String args[])
//     {
//         int x;
//         for (x = 0; x < 4; x++)
//         {
//             System.out.println(x);
//         }

//        System.out.println(x);
//     }
// }

// Output:
// 0
// 1
// 2
// 3
// 4

// Let’s look at tricky example of loop scope. Predict the output of following program. You may be surprised if you are regular C/C++ programmer.


// class Test
// {
//     public static void main(String args[])
//     {
//         int a = 5;
//         for (int a = 0; a < 5; a++)
//         {
//             System.out.println(a);
//         }
//     }
// }

// Output :
// 6: error: variable a is already defined in method go(int)
//        for (int a = 0; a < 5; a++)
// 1 error

//*-> Note:- In C++, it will run. But in java it is an error because in java, the name of the variable of inner and outer loop must be different.

// A similar program in C++ works. See this.
// As an exercise, predict the output of the following Java program.


// class Test
// {
//     public static void main(String args[])
//     {
//         {
//             int x = 5;
//             {
//                 int x = 10;
//                 System.out.println(x);
//             }
//         }
//     }
// }

// Q. From the above knowledge, tell whether the below code will run or not.


// class Test {
//     public static void main(String args[])
//     {
//         for (int i = 1; i <= 10; i++) {
//             System.out.println(i);
//         }
//         int i = 20;
//         System.out.println(i);
//     }
// }

// Output :
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 10
// 20

// Yes, it will run!
// See the program carefully, inner loop will terminate before the outer loop variable is declared.So the inner loop variable is destroyed first and then
// the new variable of same name has been created.

// Some Important Points about Variable scope in Java:  

// In general, a set of curly brackets { } defines a scope.
// In Java we can usually access a variable as long as it was defined within the same set of brackets as the code we are writing or within any curly brackets inside of the curly brackets where the variable was defined.
// Any variable defined in a class outside of any method can be used by all member methods.
// When a method has the same local variable as a member, “this” keyword can be used to reference the current class variable.
// For a variable to be read after the termination of a loop, It must be declared before the body of the loop.

//*<<----------- Static-Keyword in Java v\s C++ -------------->>  */
// Static keyword is used for almost the same purpose in both C++ and Java. There are some differences though. This post covers similarities and differences
// of static keyword in C++ and Java. 

// Similarities between C++ and Java for Static Keyword:
// 1.) Static data members can be defined in both languages.
// 2.) Static member functions can be defined in both languages.
// 3.) Easy access of static members is possible, without creating some objects.

// Differences between C++ and Java for Static Keyword:

//            C++                                                                       Java
// C++ doesn’t support static blocks.	Java supports static block (also called static clause). It is used for the static initialization of a class.
// Static Local Variables can be declared.	                            Static Local Variables are not supported.

// The above points are discussed are in detail below:

//* 1. Static Data Members: Like C++, static data members in Java are class members and shared among all objects. For example, in the following Java
//* program, the static variable count is used to count the number of objects created.

// class Test {
//     static int count = 0;

//     Test() { count++; }
//     public static void main(String arr[])
//     {
//         Test t1 = new Test();
//         Test t2 = new Test();
//         System.out.println("Total " + count + " objects created");
//     }
// }

// Output
// Total 2 objects created

// * 2. Static Member Methods: In C++ and Java, static member functions can be defined. Methods declared as static are class members and have the following restrictions:
// A) They can only call other static methods. For example, the following program fails in the compilation. fun() is non-static and it is called in static main().

// class Main {
//     public static void main(String args[])
//     {
//         System.out.println(fun());
//     }
//     int fun() { return 20; }
// }

// B) They must only access static data.
// C) They cannot access this or super. For example, the following program fails in the compilation.

// class Base {
//     static int x = 0;
// }

// class Derived extends Base {
//     public static void fun()
//     {

         // Compiler Error: non-static variable
         // cannot be referenced from a static context
//         System.out.println(super.x);
//     }
// }

// D) Like C++, static data members and static methods can be accessed without creating an object. They can be accessed using the class names. For
// example, in the following program, static data member count and static method fun() are accessed without any object. 

// class Test {
//     static int count = 0;
//     public static void fun()
//     {
//         System.out.println("Static fun() called");
//     }
// }

// class Main {
//     public static void main(String arr[])
//     {
//         System.out.println("Test.count = " + Test.count);
//         Test.fun();
//     }
// }

// Output
// Test.count = 0
// Static fun() called
// * 3. Static Block: Unlike C++, Java supports a special block, called static block (also called static clause) which can be used for static
// * initialization of a class. This code inside the static block is executed only once. See Static blocks in Java for details.

// * 4. Static Local Variables: Unlike Java, C++ supports static local variables. For example, the following Java program fails in the compilation.

// class Test {
//     public static void main(String args[])
//     {
//         System.out.println(fun());
//     }
//     static int fun()
//     {

          // Compiler Error: Static local
          // variables are not allowed
//         static int x = 10;
//         return x--;
//     }
// }

// *<<---------- Are Static Keyword Allowed in Kava ------------->>*//

// Unlike C/C++, static local variables are not allowed in Java. For example, following Java program fails in compilation with error “Static local
// variables are not allowed”

// class Test {
//      public static void main(String args[]) { 
//      System.out.println(fun());
//    }

// static int fun()
//     {
//      static int x= 10;  //Error: Static local variables are not allowed
//      return x--;
//     }
// }

// In Java, a static variable is a class variable (for whole class). So if we have static local variable (a variable with scope limited to function),
// it violates the purpose of static. Hence compiler does not allow static local variable.

// *<<------------ Instance Variable Hiding in Java ------------------>>*//
// One should have a strong understanding of this keyword in inheritance in Java to be familiar with the concept. Instance variable hiding refers to a state
// when instance variables of the same name are present in superclass and subclass. Now if we try to access using subclass object then instance variable of
// subclass hides instance variable of superclass irrespective of its return types.

// In Java, if there is a local variable in a method with the same name as the instance variable, then the local variable hides the instance variable. If we
// want to reflect the change made over to the instance variable, this can be achieved with the help of this reference.

// Example:


// Java Program to Illustrate Instance Variable Hiding
 
// Class 1
// Helper class
// class Test {

    // Instance variable or member variable
//     private int value = 10;
 
    // Method
//     void method() {
 
        // This local variable hides instance variable
//         int value = 40;
 
        // Note: this keyword refers to the current instance
 
        // Printing the value of instance variable
//         System.out.println("Value of Instance variable : " + this.value);
 
        // Printing the value of local variable
//         System.out.println("Value of Local variable : " + value);
//     }
// }
 
// Class 2
// Main class
// class GFG {
 
    // Main driver method
//     public static void main(String args[]) {
 
        // Creating object of current instance
        // inside main() method
//         Test obj1 = new Test();
 
        // Calling method of above class
//         obj1.method();
//     }
// }

// Output
// Value of Instance variable : 10
// Value of Local variable : 40

public class Variables_in_java {

    //* Declared Static Variable */
    public static String call = "Rishi Yadav";

    //-----------------------------------------------

    public String geek; //* Declared Instance Variable */
    public Variables_in_java() {        //Initialized Instance Variable
        // Default Constructor

        this.geek = "Rishi Yadav";

        //-----------------------------------------------
    }
    public static void main(String[] args) {

        //* Local Variable
        int var = 10; // Declared a Local Variable
        // This variable is local to this main method only
        System.out.println("Local Variable: " + var);

        //------------------------------------------------

        //* Instance Variable
        // Object Creation
        Variables_in_java name = new Variables_in_java();

        //Displaying O/P
        System.out.println("Geek Name is :" + name.geek);

        //--------------------------------------------------

        //* Static Variable
        // call Variable can be accessed without object creation Displaying I/O
        System.out.println("Geek name is : " + Variables_in_java.call);
    }
}
