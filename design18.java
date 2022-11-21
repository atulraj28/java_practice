import javax.swing.*;
class mytest
{
    public static void main(String[]a)
    {
        int i,j,k=1;
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
}