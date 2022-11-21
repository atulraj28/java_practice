
import javax.swing.*;
class mytest
{
    public static void main(String[]a)
    {
        int i,p,q; for(i=0;i<a.length;i++)
        {
            for(p=a[i].length();p>=0;p--)
            {
                for(q=0;q>=p;q--)
                {
                    System.out.println("*");
                }
                System.out.println("\n");
            }
        }
    }
}