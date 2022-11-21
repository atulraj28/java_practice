import javax.swing.*;
class mytest
{
    public static void main(String[]a)
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=i;j<=5;j++)
            {
                if(j%2==0)
                System.out.print("0");
                else
                System.out.print("1");
            }
            System.out.println();
        }
    }
}