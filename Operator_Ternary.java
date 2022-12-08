//* Ternary Operator :-
/*
Java ternary operator is the only conditional operator that takes three operands. It’s a one-liner replacement for the if-then-else statement and is used
a lot in Java programming. We can use the ternary operator in place of if-else conditions or even switch conditions using nested ternary operators.
Although it follows the same algorithm as of if-else statement, the conditional operator takes less space and helps to write the if-else statements
in the shortest way possible.

* Conditions of Ternary Operator are within these Symbols (?:)
               ____Resultant Value______________
              |             ____________       |
             \/            |   True    \/     |

Syntax :- Variable = Expression1 ? Expression2 : Expression3
             /\            |          False       /\    |
             |            ------------------------      |
             --------Resultant Value -------------------


also be written as :-
if(Expression1) {
    Expression2
}
else {
    Expression3
}

                            Expression 1
                                / \
                              /    \
                            /       \
                        False        True
                    ":" Part will     "?" Part will
                    get executed       get executed
                   /                    \
                 /                       \
            Expression 3              Expression 2
                \                              /
                 \                           /
                  \ Resultant Value of      /
                   \    Expression         /
                    \                     /
                     \                   /
                      \                 /
                       \               /
                        --->Variable<--

Example
num1 = 10;
num2 = 20;

res=(num1>num2) ? (num1+num2):(num1-num2)

Since num1<num2,
the second operation is performed
res = num1-num2 = -10

*/

public class Operator_Ternary {
    public static void main(String[] args) {
        // variable declaration
        int n1 = 5, n2 = 10, max;
 
        System.out.println("First num: " + n1);
        System.out.println("Second num: " + n2);
 
        // Largest among n1 and n2
        max = (n1 > n2) ? n1 : n2;
 
        // Print the largest number
        System.out.println("Maximum is = " + max);
    }
    
}
