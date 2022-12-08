/*
 * Data types are different sizes and values that can be stored in the variable that is made as per convenience and circumstances to cover up all test 
 * cases. Also, let us cover up other important ailments that there are majorly two types of languages that are as follows:
 1. First, one is a Statically typed language where each variable and expression type is already known at compile time. Once a variable is declared to be
    of a certain data type, it cannot hold values of other data types. For example C, C++, Java.
 2. The other is Dynamically typed languages. These languages can receive different data types over time. For example Ruby, Python

 Java is statically typed and also a strongly typed language because, in Java, each type of data (such as integer, character, hexadecimal, packed decimal,
 and so forth) is predefined as part of the programming language and all constants or variables defined for a given program must be described with one of 
 the data types.

    -> Primitive Data-type :- char , boolean , int , float , short , byte , long & Double
    -> Non-Primitive Data-type :- String , Array etc 
 */
public class Datatype {
   public static void main(String[] args) {

        /*
         * Boolean -> Boolean data type represents only one bit of information either true or false which is intended to represent the two truth values of 
         * logic and Boolean algebra, but the size of the boolean data type is virtual machine-dependent. Values of type boolean are not converted implicitly 
         * or explicitly (with casts) to any other type. But the programmer can easily write conversion code.

           Syntax: boolean booleanVar;
           Size: Virtual machine dependent
           Values: Boolean such as true, false
           Default Value: false

         * Byte -> The byte data type is an 8-bit signed two’s complement integer. The byte data type is useful for saving memory in large arrays.

           Syntax: byte byteVar;
           Size: 1 byte (8 bits)
           Values: -128 to 127
           Default Value: 0

         *  short -> The short data type is a 16-bit signed two’s complement integer. Similar to byte, use a short to save memory in large arrays, in 
         *  situations where the memory savings actually matters.

            Syntax: short shortVar;
            Size: 2 byte (16 bits)
            Values: -32,768 to 32,767 (inclusive)
            Default Value: 0

         * int -> It is a 32-bit signed two’s complement integer.

           Syntax: int intVar;
           Size: 4 byte ( 32 bits )
           Values: -2,147,483,648 to 2,147,483,647 (inclusive)

         * ! Note: The default value is ‘0’

            Remember: In Java SE 8 and later, we can use the int data type to represent an unsigned 32-bit integer, which has a value in the range [0, 232-1]. 
            Use the Integer class to use the int data type as an unsigned integer. 

         * long -> The range of a long is quite large. The long data type is a 64-bit two’s complement integer and is useful for those occasions where an 
         * int type is not large enough to hold the desired value.

           Syntax: long longVar;
           Size: 8 byte (64 bits)
           Values: {-9,223,372,036,854,775,808} to {9,223,372,036,854,775,807} (inclusive)

         * ! Note: The default value is ‘0’.

           Remember: In Java SE 8 and later, you can use the long data type to represent an unsigned 64-bit long, which has a minimum value of 0 and a 
           maximum value of 264-1. The Long class also contains methods like comparing Unsigned, divide Unsigned, etc to support arithmetic operations 
           for unsigned long.

         * float -> The float data type is a single-precision 32-bit IEEE 754 floating-point. Use a float (instead of double) if you need to save memory 
         * in large arrays of floating-point numbers.

           Syntax: float floatVar;
           Size: 4 byte (32 bits)
           Values: up-to 7 decimal digits

         * ! Note: The default value is ‘0.0’.

         *  double -> The double data type is a double-precision 64-bit IEEE 754 floating-point. For decimal values, this data type is generally the 
         *  default choice.

            Syntax: double doubleVar;
            Size: 8 bytes or 64 bits
            Values: Up-to 16 decimal digits

         * ! Note: The default value is taken as ‘0.0’.
            
            Both float and double data types were designed especially for scientific calculations, where approximation errors are acceptable. If accuracy 
            is the most prior concern then, it is recommended not to use these data types and use BigDecimal class instead. 

         * char -> The char data type is a single 16-bit Unicode character.

           Syntax: char charVar;
           Size: 2 byte (16 bits)
           Values: ‘\u0000’ (0) to ‘\uffff’ (65535)

         * ! Note: The default value is ‘\u0000’


         */

         // Creating and initializing custom character
         char a = 'G';
 
         // Integer data type is generally
         // used for numeric values
         int i = 89;
 
         // use byte and short
         // if memory is a constraint
         byte b = 4;
 
         // this will give error as number is
         // larger than byte range
         // byte b1 = 7888888955;
 
         short s = 56;
 
         // this will give error as number is
         // larger than short range
         // short s1 = 87878787878;
 
         // by default fraction value
         // is double in java
         double d = 4.355453532;
 
         // for float use 'f' as suffix as standard
         float f = 4.7333434f;
       
         //need to hold big range of numbers then we need this data type
         long l = 12121;
            
         // Boolean type of datatype used for true & false only
         boolean B = true;
         boolean O = false;

         System.out.println("char: " + a);
         System.out.println("integer: " + i);
         System.out.println("byte: " + b);
         System.out.println("short: " + s);
         System.out.println("float: " + f);
         System.out.println("double: " + d);
         System.out.println("long: " + l);

         if (O == false) {
            System.out.println("Boolean : Hi");
         } 
         if (B == true) {
            System.out.println("Boolean : Namaste");
         }
         
    }
}

