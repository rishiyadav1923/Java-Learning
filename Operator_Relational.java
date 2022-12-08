// * Relational Operator :-
/*
    Java Relational Operators are a bunch of binary operators used to check for relations between two operands, including equality, greater than, less
    than, etc. They return a boolean result after the comparison and are extensively used in looping statements as well as conditional if-else statements
    and so on
*/

/*
 * "Equal" to Operator (==) -> (var1 == var2)
    This operator is used to check whether the two given operands are equal or not. The operator returns true if the operand at the left-hand side is
    equal to the right-hand side, else false.

 * "Not-Equal" to Operator (!=) -> (var1 != var2)
    This operator is used to check whether the two given operands are equal or not. It functions opposite to that of the equal-to-operator. It returns
    true if the operand at the left-hand side is not equal to the right-hand side, else false.

 * "Greater-then" to Operator (>) -> (var1 > var2)
    This checks whether the first operand is greater than the second operand or not. The operator returns true when the operand at the left-hand side
    is greater than the right-hand side.

 * "Less-then" to Operator (<) -> (var1 < var2)
    This checks whether the first operand is less than the second operand or not. The operator returns true when the operand at the left-hand side is
    less than the right-hand side. It functions opposite to that of the greater-than operator.

 * "Greater-then-equal" to Operator (>=) -> (var1 >= var2)
    This checks whether the first operand is greater than or equal to the second operand or not. The operator returns true when the operand at the
    left-hand side is greater than or equal to the right-hand side.

 * "Less-then-equal" to Operator (<=) -> (var1 <= var2)
    This checks whether the first operand is less than or equal to the second operand or not. The operator returns true when the operand at the left-hand
    side is less than or equal to the right-hand side.
 */

public class Operator_Relational {
    public static void main(String[] args) {

         // * "Equal" to Operator (==)
         // Initializing variables
         int var1 = 5, var2 = 10, var3 = 5;
 
         // Displaying var1, var2, var3
         System.out.println("Var1 = " + var1);
         System.out.println("Var2 = " + var2);
         System.out.println("Var3 = " + var3);
  
         // Comparing var1 and var2 and
         // printing corresponding boolean value
         System.out.println("var1 == var2: " + (var1 == var2));
  
         // Comparing var1 and var3 and
         // printing corresponding boolean value
         System.out.println("var1 == var3: " + (var1 == var3));
        
         // * "Not-Equal" to Operator (!=)
         // Initializing variables
         int var4 = 5, var5 = 10, var6 = 5;
 
         // Displaying var4, var5, var6
         System.out.println("Var4 = " + var4);
         System.out.println("Var5 = " + var5);
         System.out.println("Var6 = " + var6);
  
         // Comparing var4 and var5 and
         // printing corresponding boolean value
         System.out.println("var4 == var5: " + (var4 != var5));
  
         // Comparing var4 and var6 and
         // printing corresponding boolean value
         System.out.println("var4 == var6: " + (var4 != var6));
         
         // * "Greater-then" to Operator (>)
         // Initializing variables
         int var7 = 30, var8 = 20, var9 = 500;
 
         // Displaying var7, var8, var9
         System.out.println("Var7 = " + var7);
         System.out.println("Var8 = " + var8);
         System.out.println("Var9 = " + var9);
 
         // Comparing var7 and var8 and
         // printing corresponding boolean value
         System.out.println("var7 > var8: " + (var7 > var8));
 
         // Comparing var7 and var9 and
         // printing corresponding boolean value
         System.out.println("var7 > var9: " + (var7 > var9));
         
         // * "Less-then" to Operator (<)
         // Initializing variables
         int var10 = 10, var11 = 20, var12 = 5;
 
         // Displaying var1, var2, var3
         System.out.println("Var10 = " + var10);
         System.out.println("Var11 = " + var11);
         System.out.println("Var12 = " + var12);
 
         // Comparing var10 and var11 and
         // printing corresponding boolean value
         System.out.println("var10 < var11: " + (var10 < var11));
 
         // Comparing var2 and var3 and
         // printing corresponding boolean value
         System.out.println("var11 < var12: " + (var11 < var12));
         
         // * "Greater-then-Equal" to Operator (>=)
          // Initializing variables
         int var13 = 20, var14 = 20, var15 = 10;
 
         // Displaying var1, var2, var3
         System.out.println("Var13 = " + var13);
         System.out.println("Var14 = " + var14);
         System.out.println("Var15 = " + var15);
 
         // Comparing var13 and var14 and
         // printing corresponding boolean value
         System.out.println("var13 >= var14: " + (var13 >= var14));
 
         // Comparing var13 and var14 and
         // printing corresponding boolean value
         System.out.println("var15 >= var13: " + (var15 >= var13));
         
         // * "Less-then-Equal" to Operator (<=)
          // Initializing variables
         int var16 = 10, var17 = 10, var18 = 9;
 
         // Displaying var1, var2, var3
         System.out.println("Var16 = " + var16);
         System.out.println("Var17 = " + var17);
         System.out.println("Var18 = " + var18);
 
         // Comparing var16 and var17 and
         // printing corresponding boolean value
         System.out.println("var16 <= var17: " + (var16 <= var17));
 
         // Comparing var17 and var18 and
         // printing corresponding boolean value
         System.out.println("var17 <= var18: " + (var17 <= var18));
    }

}
