/*
  Unary Operators :- Java unary operators are the types that need only one operand to perform any operation like increment, decrement, negation, etc.
  It consists of various arithmetic, logical and other operators that operate on a single operand. Let’s look at the various unary operators in detail
  and see how they operate.
 */

 // Some Unary Operators are :-
 // Unary minus (-) -> -(operand)
 // Unary NOT (!) -> !(Operand)
 // Unary Increment (++) -> ++(Operand), (Operand)++
 // Unary Decrement (--) -> --(Operand), (Operand)--
 // Unary Bitwise (~) -> ~(Operand)

 public class Operator_unary {
    public static void main(String[] args) {

        //* For Unary minus
        int n1 = 20;

          // Printing the above variable
          System.out.println("Number = " + n1);
 
          // Performing unary operation
          n1 = -n1;

          // Printing the above result number
          // after unary operation
          System.out.println("Result = " + n1);

        //* For Unary NOT
        boolean cond = true;
        int a = 10, b=1;
        // Displaying values stored in above variables
        System.out.println("Cond is: " + cond);
        System.out.println("Var1 = " + a);
        System.out.println("Var2 = " + b);

        // Displaying values stored in above variables
        // after applying unary NOT operator
        System.out.println("Now cond is: " + !cond);
        System.out.println("!(a < b) = " + !(a < b));
        System.out.println("!(a > b) = " + !(a > b));

        //* For Unary Increment
        int num1 = 60;
        num1++;
        System.out.println(num1);
        ++num1;   // Pre-Increment
        System.out.println(num1);

        //* For Unary Decrement
        int num2 = 60;
        num2--;
        System.out.println(num2);
        --num2;   // Pre-Decrement
        System.out.println(num2);

        //* For Unary Bitwise
        int bit1 = 4, bit2 = -4;
        // Printing numbers on console
        System.out.println("First Number = " + bit1);
        System.out.println("Second Number = " + bit2);
 
        // Printing numbers on console after
        // performing bitwise complement
        System.out.println(
            bit1 + "'s bitwise complement = " + ~bit1);
        System.out.println(
            bit2 + "'s bitwise complement = " + ~bit2);

    }
 }