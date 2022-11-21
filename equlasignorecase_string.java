import javax.swing.*;
class mytest
{
    public static void main (String[]a)
    {
        String str1,str2;
        str1=JOptionPane.showInputDialog("enter first string");
        str2=JOptionPane.showInputDialog("enter second string");
        if(str1.equalsIgnoreCase(str2))
        {
            System.out.println("both are equal");
        }
        else
        System.out.println("both are not equal");


    }
}