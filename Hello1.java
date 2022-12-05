// This is a simple Java program.
// FileName : "HelloWorld.java".

public class Hello1
{
	// Your program begins with a call to main().
	// Prints "Hello, World" to the terminal window.
	public static void main(String args[])
	{
		System.out.println("Hello World");
	}
}

// Time Complexity -> O(1)
// Space Complexity -> O(1)

/*
 * The “Hello World!” program consists of three primary components: the HelloWorld class definition, the main method, and source code comments. The following 
 * explanation will provide you with a basic understanding of the code:

 * 1. Class definition
This line uses the keyword class to declare that a new class is being defined.
class HelloWorld {
        Statements
}

 *  2. HelloWorld
    It is an identifier that is the name of the class. The entire class definition, including all of its members, will be between the opening curly brace “{” and
    the closing curly brace “}“.

 *  3. main method:
    In the Java programming language, every application must contain a main method. The main function(method) is the entry point of your Java application, and 
    it’s mandatory in a Java program. whose signature in Java is:

 *  public static void main(String[] args)

    public:  So that JVM can execute the method from anywhere.
    static:  The main method is to be called without an object. The modifiers public and static can be written in either order.
    void:    The main method doesn’t return anything.
    main():  Name configured in the JVM. The main method must be inside the class definition. The compiler executes the codes starting always from the main function.
    String[]: The main method accepts a single argument, i.e., an array of elements of type String.

    Like in C/C++, the main method is the entry point for your application and will subsequently invoke all the other methods required by your program.

    The next line of code is shown here. Notice that it occurs inside the main() method.
    System.out.println("Hello, World");

    This line outputs the string “Hello, World” followed by a new line on the screen. Output is accomplished by the built-in println( ) method. The System is a 
    predefined class that provides access to the system, and out is the variable of type output stream connected to the console.

 *  Comments
    They can either be multiline or single-line comments.

    This is a simple Java program.
    Call this file "HelloWorld.java".
    This is a single-line comment. This type of comment must begin with // as in C/C++. For multiline comments, they must begin from /* and end with */
/*
 *  Important Points
   1. The name of the class defined by the program is HelloWorld, which is the same as the name of the file(HelloWorld.java). This is not a coincidence. In Java,
      all codes must reside inside a class, and there is at most one public class which contains the main() method.
   2. By convention, the name of the main class(a class that contains the main method) should match the name of the file that holds the program.
   3. Every Java program must have a class definition that matches the filename (class name and file name should be same).

 *  Compiling the program
    1. After successfully setting up the environment, we can open a terminal in both Windows/Unix and go to the directory where the file – HelloWorld.java is present.

    2. Now, to compile the HelloWorld program, execute the compiler – javac, to specify the name of the source file on the command line, as shown:

    javac HelloWorld.java

    3. The compiler creates a HelloWorld.class (in the current working directory) that contains the bytecode version of the program. Now, to execute our program, 
       JVM(Java Virtual Machine) needs to be called using java, specifying the name of the class file on the command line, as shown:
       java HelloWorld

    4. This will print “Hello World” to the terminal screen.

 */