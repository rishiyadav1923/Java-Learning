//* instanceof Keyword in Java :-
// "instanceof" is a Keyword that is used for checking if a reference variable is containing a given type of object reference or not. Following is a Java
// Program to show different behaviors of "instanceof". Hence forth it is known as comparison operator where the instance is getting compared to "type"
// returning boolean true or false in Java we don't have 0 & 1 boolean return type

class Parent3 {
    int value = 1000;
}

class Child3 extends Parent3 {
    int value = 10;
}

//-----------------------------------------

class Parent2 {}
class Child2 extends Parent2 {}

//------------------------------------------

class Parent1 {}
class Child1 extends Parent1 {}

//-------------------------------------------

class Test { }

//--------------------------------------------
// Class 1 -> Parent Class
class Parent {}

// Class 2 -> Child Class
class Child extends Parent {}
//---------------------------------------------

public class Instanceof_Keyword {
    public static void main(String[] args) {

        //* Java Program to Illustrate instanceof Keyword
        // Creating object of class inside main()
         Instanceof_Keyword object = new Instanceof_Keyword();

         // Returning instanceof
         System.out.println(object instanceof Instanceof_Keyword);

         //-------------------------------------------------------------

         //* Java program to demonstrate working of instanceof Keyword
         // Creating object of child class
         Child cobj = new Child();
 
         // A simple case
         if (cobj instanceof Child)
             System.out.println("cobj is instance of Child");
         else
             System.out.println("cobj is NOT instance of Child");
 
         // instanceof returning true for Parent class also
         if (cobj instanceof Parent)
             System.out.println("cobj is instance of Parent");
         else
             System.out.println("cobj is NOT instance of Parent");
 
         // instanceof returns true for all ancestors
 
         // Note : Object is ancestor of all classes in Java
         if (cobj instanceof Object)
             System.out.println("cobj is instance of Object");
         else
             System.out.println("cobj is NOT instance of Object");

        //----------------------------------------------------------------

        //* Java program to demonstrate that instanceof returns false for null
        Test tobj = null;
 
        // A simple case
        if (tobj instanceof Test)
           System.out.println("tobj is instance of Test");
        else
           System.out.println("tobj is NOT instance of Test");

        //----------------------------------------------------------------

        //* A Java program to show that a parent object is not an instance of Child
        Parent1 pobj = new Parent1();
        if (pobj instanceof Child1)
           System.out.println("pobj is instance of Child");
        else
           System.out.println("pobj is NOT instance of Child");

        //--------------------------------------------------------------------

        //* A Java program to show that a parent reference referring to a Child is an instance of Child
        // Reference is Parent type but object is
        // of child type.
        Parent2 dobj = new Child2();
        if (dobj instanceof Child2)
           System.out.println("cobj is instance of Child");
        else
           System.out.println("cobj is NOT instance of Child");

        //---------------------------------------------------------------------
        /*
         * Now, the application of instanceof keyword is as follows:
         We have seen here that a parent class data member is accessed when a reference of parent type refers
         to a child object. We can access child data members using typecasting.

         Syntax:    ((child_class_name) Parent_Reference_variable).func.name()

         When we do typecast, it is always a good idea to check if the typecasting is valid or not. instanceof
         helps us here. We can always first check for validity using instancef, then do typecasting.
         */

         // Java program to demonstrate that non-method
         // members are accessed according to reference
         // type (Unlike methods which are accessed according
         // to the referred object)

         /*
         Parent3 cobj1 = new Child3();
         Parent3 par = cobj1;
  
          Using instanceof to make sure that par is a valid reference before typecasting
         if (par instanceof Child3)
         {
             System.out.println("Value accessed through " + "parent reference with typecasting is " + ((Child3)par).value);
         }
         */
    }
}
