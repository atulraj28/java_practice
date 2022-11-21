import javax.swing.*;
//this programm will take only two input from cmd and give result as they are equal or not
class mytest
{
    public static void main (String[]a)
    {
        if(a.length==2)
        {
            if(a[0].equals(a[1]))
            {
                System.out.println("both strings are equal");
            }
            else
                System.out.println("both strings are not equal");

        }
        else
        System.out.println("only two strings are allowed");
    }
}