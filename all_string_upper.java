import javax.swing.*;
//this will make the input string into upper case
class mytest
{
    public static void main (String[]a)
    {
        int i;
        for(i=0;i<a.length;i++)
        {
            System.out.println("upper case of "+a[i]+" is "+a[i].toUpperCase());
        }
    }
}