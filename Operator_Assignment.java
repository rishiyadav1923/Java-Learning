// * Assignment Operator :-
/*   These operators are used to assign values to a variable. The left side operand of the assignment operator is a variable, and the right side operand
of the assignment operator is a value. The value on the right side must be of the same data type of the operand on the left side. Otherwise, the compiler
will raise an error. This means that the assignment operators have right to left associativity, i.e., the value given on the right-hand side of the
operator is assigned to the variable on the left. Therefore, the right-hand side value must be declared before using it or should be a constant. The
general format of the assignment operator is,


variable operator value;
Types of Assignment Operators in Java
The Assignment Operator is generally of two types. They are:

* Simple Assignment Operator :-
The Simple Assignment Operator is used with the “=” sign where the left side consists of the operand and the right side consists of a value. The value of
the right side must be of the same data type that has been defined on the left side.

* Compound Assignment Operator :-
The Compound Operator is used where +,-,*, and / is used along with the = operator.
Let’s look at each of the assignment operators and how they operate:

    *-> (=) Operator - (num1 = num2)
    This is the most straightforward assignment operator, which is used to assign the value on the right to the variable on the left.
    This is the basic definition of an assignment operator and how it functions.

    *-> (+=) Operator - (num1 += num2) -> (num1 = num1 + num2)
    This operator is a compound of ‘+’ and ‘=’ operators. It operates by adding the current value of the variable on the left to the value on the right
    and then assigning the result to the operand on the left.

    *-> (-=) Operator - (num1 -= num2) -> (num1 = num1 - num2)
    This operator is a compound of ‘-‘ and ‘=’ operators. It operates by subtracting the variable’s value on the right from the current value of the
    variable on the left and then assigning the result to the operand on the left.

    *-> (*=) Operator - (num1 *= num2) -> (num1 = num1 * num2)
    This operator is a compound of ‘*’ and ‘=’ operators. It operates by multiplying the current value of the variable on the left to the value on the
    right and then assigning the result to the operand on the left.

    *-> (/=) Operator - (num1 /= num2) -> (num1 = num1 / num2)
    This operator is a compound of ‘/’ and ‘=’ operators. It operates by dividing the current value of the variable on the left by the value on the
    right and then assigning the quotient to the operand on the left. 
*/

public class Operator_Assignment {
    public static void main(String[] args) {

        //* For (=) Operator
         // Declaring variables
         int num;
         String name;
  
         // Assigning values
         num = 10;
         name = "Geeks-for-Geeks";
  
         // Displaying the assigned values
         System.out.println("num is assigned: " + num);
         System.out.println("name is assigned: " + name);
        
         //* For (+=) Operator
         // Declaring variables
        int num1 = 10, num2 = 20;
 
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
 
        // Adding & Assigning values
        num1 += num2;
 
        // Displaying the assigned values
        System.out.println("num1 = " + num1);
        
        //* For (-=) Operator
         // Declaring variables
         int num3 = 10, num4 = 20;
 
         System.out.println("num3 = " + num3);
         System.out.println("num4 = " + num4);
  
         // Subtracting & Assigning values
         num3 -= num4;
  
         // Displaying the assigned values
         System.out.println("num3 = " + num3);
        
         //* For (*=) Operator
         // Declaring variables
         int num5 = 10, num6 = 20;
 
         System.out.println("num5 = " + num5);
         System.out.println("num6 = " + num6);
         
         // Multiplying & Assigning values
         num5 *= num6;
         
         // Displaying the assigned values
         System.out.println("num5 = " + num5);

         //* For (/=) Operator
         // Declaring variables
        int num7 = 20, num8 = 10;
 
        System.out.println("num7 = " + num7);
        System.out.println("num8 = " + num8);
 
        // Dividing & Assigning values
        num7 /= num8;
 
        // Displaying the assigned values
        System.out.println("num7 = " + num7);

        //* For (%=) Operator
        // Declaring variables
        int num9 = 5, num10 = 3;

        System.out.println("num9 = " + num9);
        System.out.println("num10 = " + num10);
        // Moduling & Assigning Values
        num9 %= num10;

        System.out.println("num9 = " + num9);


    }
    
}
