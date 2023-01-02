// A Wrapper class is a class whose object wraps or contains primitive data types. When we create an object to a wrapper class, it contains a field and in
// this field, we can store primitive data types. In other words, we can wrap a primitive value into a wrapper class object.

// Need of Wrapper Classes
// 1.) They convert primitive data types into objects. Objects are needed if we wish to modify the arguments passed into a method (because primitive
//     types are passed by value).
// 2.) The classes in java.util package handles only objects and hence wrapper classes help in this case also.
// 3.) Data structures in the Collection framework, such as ArrayList and Vector, store only objects (reference types) and not primitive types.
// 4.) An object is needed to support synchronization in multithreading.

//          Primitive Data-type                             Wrapper Class
//                char                                       Character
//                byte                                          Byte
//                short                                         Short
//                 int                                          Integer
//                long                                          Long
//                float                                         Float
//                double                                        Double
//                boolean                                       Boolean

//* Auto-boxing */
//  Automatic conversion of primitive types to the object of their corresponding wrapper classes is known as auto-boxing. For example – conversion of int
//  to Integer, long to Long, double to Double etc.

//* Un-boxing */
// It is just the reverse process of auto-boxing. Automatically converting an object of a wrapper class to its corresponding primitive type is known as
// unboxing. For example – conversion of Integer to int, Long to long, Double to double, etc.

public class Wrapper_cls {
    public static void main(String[] args) {

         //  byte data type
         //  byte a = 1;

         // wrapping around Byte object
         // Byte byte obj = new Byte(a);

         // int data type
         // int b = 10;

         // wrapping around Integer object
         // Integer int obj = new Integer(b);

         // float data type
         // float c = 18.6f;

         // wrapping around Float object
         // Float float obj = new Float(c);
   
         // double data type
         // double d = 250.5;

         // Wrapping around Double object
         // Double double obj = new Double(d);

         // char data type
         // char e='a';

         // wrapping around Character object
         // Character char obj = e;

         //  printing the values from objects
         //  System.out.println("Values of Wrapper objects (printing as objects)");
         //  System.out.println("Byte object byte obj:  " + byte obj);
         //  System.out.println("Integer object int obj:  " + int obj);
         //  System.out.println("Float object float obj:  " + float obj);
         //  System.out.println("Double object double obj:  " + double obj);
         //  System.out.println("Character object char obj:  " + char obj);

         //  objects to data types (retrieving data types from objects)
         //  unwrapping objects to primitive data types
         //  byte bv = byte obj;
         //  int iv = int obj;
         //  float fv = float obj;
         //  double dv = double obj;
         //  char cv = char obj;

         // printing the values from data types
         // System.out.println("Unwrapped values (printing as data types)");
         // System.out.println("byte value, bv: " + bv);
         // System.out.println("int value, iv: " + iv);
         // System.out.println("float value, fv: " + fv);
         // System.out.println("double value, dv: " + dv);
         // System.out.println("char value, cv: " + cv);

        }
}