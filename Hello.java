/*
   * 1. Class: The class is a blueprint (plan) of the instance of a class (object). It can be defined as a template that describes the data and behavior 
   * associated with its instance.
   Example: Blueprint of the house is class.

    * 2. Object: The object is an instance of a class. It is an entity that has behavior and state.
    Example: A car is an object whose states are: brand, color, and number plate.
    Behavior: Running on the road.
 
    * 3. Method: The behavior of an object is the method.
    Example: The fuel indicator indicates the amount of fuel left in the car.
 
    * 4. Instance variables: Every object has its own unique set of instance variables. The state of an object is generally created by the values that are
    * assigned to these instance variables.

 */

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}


// * Comments ->
//  Single line 
/*
    Multiline Comment 
*/
/** Documentation */

// * 2. Source File Name
// The name of a source file should exactly match the public class name with the extension of .java. The name of the file can be a different name if it does not 
// have any public class. Assume you have a public class GFG.
// GFG.java // valid syntax
// gfg.java // invalid syntax

// * 3. Case Sensitivity
// Java is a case-sensitive language, which means that the identifiers AB, Ab, aB, and ab are different in Java.
// System.out.println("Alice"); // valid syntax
// system.out.println("Alice"); // invalid syntax

/*
 * 4. Class Names
 i. The first letter of the class should be in Uppercase (lowercase is allowed, but discouraged).
 ii. If several words are used to form the name of the class, each inner words first letter should be in Uppercase. Underscores are allowed, but not recommended. 
    Also allowed are numbers and currency symbols, although the latter are also discouraged because the are used for a special purpose (for inner and anonymous classes).

class MyJavaProgram    // valid syntax
class 1Program         // invalid syntax
class My1Program       // valid syntax
class $Program         // valid syntax, but discouraged
class My$Program       // valid syntax, but discouraged (inner class Program inside the class My)
class myJavaProgram    // valid syntax, but discouraged
 */

// * 5. public static void main(String [] args)
//   The method main() is the main entry point into a Java program; this is where the processing starts.
//   Also allowed is the signature public static void main(String… args).

// * 6. Method Names
//   i. All the method names should start with a lowercase letter.
//  ii. If several words are used to form the name of the method, then each first letter of the inner word should be in Uppercase. Underscores are allowed, but 
//  not recommended. Also allowed are digits and currency symbols.

//  public void employeeRecords() // valid syntax
//  public void EmployeeRecords() // valid syntax, but discouraged


// * 7. Identifiers in java
// Identifiers are the names of local variables, instance and class variables, and labels, but also the names for classes, packages, modules and methods. All Unicode
// characters are valid, not just the ASCII subset. 

// i. All identifiers can begin with a letter, a currency symbol or an underscore (_). According to the convention, a letter should be lower case for variables.
// ii. The first character of identifiers can be followed by any combination of letters, digits, currency symbols and the underscore. The underscore is not 
// recommended for the names of variables. Constants (static final attributes and enums) should be in all Uppercase letters.
// iii. Most importantly identifiers are case-sensitive.
// iv. A keyword cannot be used as an identifier since it is a reserved word and has some special meaning.

// Ex -> Legal identifiers: MinNumber, total, ak74, hello_world, $amount, _under_value
//       Illegal identifiers: 74ak, -amount

// * 8. White spaces in Java
// A line containing only white spaces, possibly with the comment, is known as a blank line, and the Java compiler totally ignores it.

// * 9. Access Modifiers: These modifiers control the scope of class and methods.

// 1. Access Modifiers: default, public, protected, private
// 2. Non-access Modifiers: final, abstract, strictfp.

/*
 * 10. Understanding Access Modifiers:

Access Modifier	      Within Class	      Within Package	    Outside Package by subclass only	      Outside Package
  Private	                  Y	                  N	                           N	                             N
  Default	                  Y	                  Y	                           N	                             N
  Protected	                Y	                  Y	                           Y	                             N
  Public	                  Y	                  Y	                           Y	                             Y
*/

/*
 * 11. Java Keywords
  Keywords or Reserved words are the words in a language that are used for some internal process or represent some predefined actions. These words are therefore 
  not allowed to use as variable names or objects. 

abstract	      assert	      boolean	         break
byte	           case	         catch	         char
class	          const	        continue	      default
do	            double	        else	         enum
extends	        final	        finally	         float
for	            goto	          if	         implements
import	        instanceof	    int	         interface
long	          native	        new	          package
private	        protected	     public	        return
short	          static	       strictfp	       super
switch	        synchronized	   this	         throw
throws	        transient	       try	          void
volatile	      while
 */

// <------THE END --------> //