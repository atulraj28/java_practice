import javax.swing.*;
//this programm will take input from cmd and give the first charrecter of each string
class mytest
{
    public static void main (String[]a)
    {
        int i;
        for(i=0;i<a.length;i++)
        {
            System.out.println("First Charecter of "+a[i]+" is "+a[i].charAt(0));
        }
    }
}