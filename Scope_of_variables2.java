public class Scope_of_variables2 {
    public static void main(String args[])
    {   /*
        for (int x = 0; x < 4; x++)
        {
            System.out.println(x);
        }
 
        Will produce error
        System.out.println(x);
        */

        //-----------------------------------
        // The right way of righting above code is
        int x;
        for (x = 0; x < 4; x++)
        {
            System.out.println(x);
        }
 
       System.out.println(x);
    }
}
