// Airthematic Operator :- These operators involve the mathematical operators that can be used to perform various simple or advanced arithmetic operations
// on the primitive data types referred to as the operands. These operators consist of various unary and binary operators that can be applied on a single
// or two operands. Let’s look at the various operators that Java has to provide under the arithmetic operators.

// These Operator involve Basic Mathematical Operations Like :-
// + -> Addition
// - -> Subtraction
// * -> Multiplication
// / -> Division (Gives Quotient)
// % -> Modulus (Gives Remainder)

// Java code to illustrate Addition operator

class Operator_Airthematic {
	public static void main(String[] args)
	{
		// initializing variables
		int num1 = 10, num2 = 20, sum = 0, sub = 0, mul = 0, div = 0, mod = 0;

		// Displaying num1 and num2
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

		// adding num1 and num2
		sum = num1 + num2;
		System.out.println("The sum = " + sum);

        // Subtracting num1 from num2
        sub = num2 - num1;
        System.out.println("The Subtraction is = " + sub);

        // Multiply num1 and num2
        mul = num1 * num2;
        System.out.println("The Multiplication is = " + mul);

        // Division of num1 and num2
        div = num2 / num1;
        System.out.println("The Division is = " + div);

        // Modulus of num1 and num2
        mod = num2 % num1;
        System.out.println("The Modulus is = " + mod);
	}

}

