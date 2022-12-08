//* Shift Operator :-
/*
By shifting the bits of its first operand right or left, a shift operator performs bit manipulation on data. The shift operators available in the Java
programming language are listed below. The shift operator is a java operator that is used to shift bit patterns right or left.

Types of Shift Operators in Java:
Name of operator

Sign 	                                                    Description
Signed Left Shift	        <<	            The left shift operator moves all bits by a given number of bits to the left.
Signed Right Shift	        >>	            The right shift operator moves all bits by a given number of bits to the right.
Unsigned Right Shift	    >>>	            It is the same as the signed right shift, but the vacant leftmost position is filled with 0 instead of the
                                            sign bit.

*-> Signed Left-Shift Operator :-
    The Operator is represented by symbol (<<), read as a Double-Less then
    Syntax -> left_Operand << number
    Calculating the value of number<<2 if number=2. When the value of a number is shifted to the left two places, the leftmost two bits are lost.
    The number has a value of two. 0010 is the binary representation of the number 2.

*-> Signed Right-Shift Operator :-
    The Right Shift Operator moves the bits of a number in a given number of places to the right. The >> sign represents the right shift operator, which
    is understood as double greater than. When you type x>>n, you tell the computer to move the bits x to the right n places.
    When we shift a number to the right, the least significant bits (rightmost) are deleted, and the sign bit is filled in the most considerable place
    (leftmost).

    Syntax:
    left_operand  >>  number

    Illustration:
    Calculate the value of number>>2 if number=8.
    When the value of a number is shifted to the right two places, the rightmost two bits are lost. The number has a value of eight. 1000 is the binary
    representation of the number 8.

*-> Un-Signed Right-Shift Operator :-
    Unsigned Right Shift Operator moves the bits of the integer a given number of places to the right. The sign bit was filled with 0s. The Bitwise Zero
    Fill Right Shift Operator is represented by the symbol >>>.
    Syntax:
    left_operand  >>>  number

*-> NOTE :- There is no Unsigned Left-Shift Operator Because, Logical (<<) & Arithmetic Left-Shift Operations are identical
*/

public class Operator_Shift {
    public static void main(String[] args) {

        //* Signed Left-Shift Operator
        byte a = 64, b;
        int i;

        i = a << 2;
        b = (byte)(a << 2);
        System.out.println("Original value of a: " + a);
        System.out.println("i and b: " + i + " " + b);
        //-------------------------------------------------------------
        int number = 2;

        // 2 bit left shift operation
        int Ans = number << 2;

        System.out.println(Ans);

        //* Signed Right-Shift Operator
        int num = 8;

        // 2 bit signed right shift
        int ans = num >> 2;

        System.out.println(ans);
        //--------------------------------------------------------------
        char hex[]={
            '0','1','2','3','4','5',
              '6','7','8','9','a','b','c',
              'd','e','f'
            };

           byte d=(byte) 0xf1;

           System.out.println("d = 0x" + hex [(d>>4) & 0x0f] + hex[d & 0x0f]);

           //* Un-Signed Right-Shift Operator
           byte num1 = 8;
        byte num2 = -8;

        System.out.println(num1 >>> 2);
        System.out.println(num2 >>> 2);
    }

}
