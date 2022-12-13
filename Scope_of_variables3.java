// Let’s look at tricky example of loop scope. Predict the output of following program. You may be surprised if you are regular C/C++ programmer.

public class Scope_of_variables3
{
    public static void main(String args[])
    {/*
        int a = 5;
        for (int a = 0; a < 5; a++)
        {
            System.out.println(a);
        }
    */}
}

// Output :
// 6: error: variable a is already defined in method go(int)
//        for (int a = 0; a < 5; a++)
//                 ^
// 1 error
// Note:- In C++, it will run. But in java it is an error because in java, the name of the variable of inner and outer loop must be different.
