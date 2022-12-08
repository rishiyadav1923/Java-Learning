// In programming languages, identifiers are used for identification purposes. In Java, an identifier can be a class name, method name, variable name, or label. For example : 
 

public class Identifiers
{
    public static void main(String[] args)
    {
        int a = 20;
        System.out.println(a);
    }
}
 

 
// In the above java code, we have 5 identifiers namely : 
 

// Test : class name.
// main : method name.
// String : predefined class name.
// args : variable name.
// a :  variable name.
// Rules for defining Java Identifiers 


// There are certain rules for defining a valid java identifier. These rules must be followed, otherwise we get compile-time error. These rules are also valid for other languages like C,C++. 
 

// The only allowed characters for identifiers are all alphanumeric characters([A-Z],[a-z],[0-9]), ‘$‘(dollar sign) and ‘_‘ (underscore).For example “geek@” is not a valid java identifier as it contain ‘@’ special character.
// Identifiers should not start with digits([0-9]). For example “123geeks” is a not a valid java identifier.
// Java identifiers are case-sensitive.
// There is no limit on the length of the identifier but it is advisable to use an optimum length of 4 – 15 letters only.
// Reserved Words can’t be used as an identifier. For example “int while = 20;” is an invalid statement as while is a reserved word. There are 53 reserved words in Java.

// Examples of valid identifiers : 
 /*
MyVariable
MYVARIABLE
myvariable
x
i
x1
i1
_myvariable
$myvariable
sum_of_array
geeks123
*/

// Examples of invalid identifiers : 
 
/*
My Variable  // contains a space
123geeks   // Begins with a digit
a+c // plus sign is not an alphanumeric character
variable-2 // hyphen is not an alphanumeric character
sum_&_difference // ampersand is not an alphanumeric character
Reserved Words 
*/
// Any programming language reserves some words to represent functionalities defined by that language. These words are called reserved words.They can be briefly categorized into two parts : keywords(50) and literals(3). Keywords define functionalities and literals define a value. Identifiers are used by symbol tables in various analyzing phases(like lexical, syntax, semantic) of a compiler architecture. 

// Note: The keywords const and goto are reserved, even though they are not currently used. In place of const, the final keyword is used. Some keywords like strictfp are included in later versions of Java. 
