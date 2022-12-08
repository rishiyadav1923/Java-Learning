//* Logical Operators :-
/*
Logical operators are used to performing logical “AND”, “OR” and “NOT” operations, i.e. the function similar to AND gate and OR gate in digital electronics.
They are used to combine two or more conditions/constraints or to complement the evaluation of the original condition under particular consideration. One
thing to keep in mind is the second condition is not evaluated if the first one is false, i.e. it has a short-circuiting effect. Used extensively to test
for several conditions for making a decision.

1. AND Operator ( && ) – if( a && b ) [if true execute else don’t]
2. OR Operator ( || ) – if( a || b) [if one of them is true execute else don’t]
3. NOT Operator ( ! ) – !(a<b) [returns false if a is smaller than b]

    *-> Logical "AND" Operator (&&) (condition1 && condition2)
    This operator returns true when both the conditions under consideration are satisfied or are true. If even one of the two yields false, the operator
    results false. In Simple terms, cond1 && cond2 returns true when both cond1 and cond2 are true (i.e. non-zero).

    *-> Logical "OR" Operator (||) (condition1 || condition2)
    This operator returns true when one of the two conditions under consideration is satisfied or is true. If even one of the two yields true, the operator
    results true. To make the result false, both the constraints need to return false.

    *-> Logical "NOT" Operator (!) (!(condition1)
    Unlike the previous two, this is a unary operator and returns true when the condition under consideration is not satisfied or is a false condition.
    Basically, if the condition is false, the operation returns true and when the condition is true, the operation returns false.
*/

public class Operator_Logical {
    public static void main(String[] args)   {

        //* Logical "AND" Operator (&&) (condition1 && condition2)
         // initializing variables
         int a = 10, b = 20, c = 20, d = 0;

         // Displaying a, b, c
         System.out.println("Var1 = " + a);
         System.out.println("Var2 = " + b);
         System.out.println("Var3 = " + c);

         // using logical AND to verify
         // two constraints
         if ((a < b) && (b == c)) {
             d = a + b + c;
             System.out.println("The sum is: " + d);
         }
         else {
             System.out.println("False conditions");
         }

         //* Logical "AND" Operator (&&) (condition1 && condition2) (Short-circuiting)
         // initializing variables
         int p = 10, q = 20, r = 15;

         // displaying q
         System.out.println("Value of q : " + q);

         // Using logical AND
         // Short-Circuiting effect as the first condition is
         // false so the second condition is never reached
         // and so ++q(pre increment) doesn't take place and
         // value of q remains unchanged
         if ((p > r) && (++q > r)) {
             System.out.println("Inside if block");
         }

         // displaying q
         System.out.println("Value of q : " + q);

         //* Logical "OR" Operator (||) (condition1 || condition2)
         // initializing variables
         int x = 10, y = 1, z = 10, w = 30;

         // Displaying x, y, z
         System.out.println("Var1 = " + x);
         System.out.println("Var2 = " + y);
         System.out.println("Var3 = " + z);
         System.out.println("Var4 = " + w);

         // using logical OR to verify
         // two constraints
         if (x > y || z == q)
             System.out.println("One or both + the conditions are true");
         else
             System.out.println("Both the + conditions are false");

         //* Logical "NOT" Operator (!) (!(condition))
         // initializing variables
         int u = 10, v = 1;
  
         // Displaying u, v
         System.out.println("Var1 = " + u);
         System.out.println("Var2 = " + v);
  
         // Using logical NOT operator
         System.out.println("!(u < v) = " + !(u < v));
         System.out.println("!(u > v) = " + !(u > v));
    }
}
