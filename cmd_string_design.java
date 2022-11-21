import javax.swing.*;
//this code will take input from cmd and print it in certain design formate with the different charecters of the string given
class mytest
{
    public static void main(String[]a)
    {
        int i,p,q;
        for(i=0;i<a.length;i++)
        {
            for(p=a[i].length()-1;p>=0;p--)
            {
                for(q=0;q<=p;q++)
                {
                    System.out.print(a[i].charAt(q));
                }
                System.out.println();
            }
        }

    }
}