import java.util.*;
class mytest
{
    public static void main(String[]a)
    {
        Scanner s=new Scanner(System.in);
        int [][]n=new int [3][3];
        int r,c,sum=0;
        for(r=0;r<3;r++)
        {
            for(c=0;c<3;c++)
            {
                System.out.println("enter number");
                n[r][c]=s.nextInt();
                if(r+c==2)
                sum=sum+n[r][c];
            }
        }
                for(r=0;r<3;r++)
        {
            for(c=0;c<3;c++)
            {
                System.out.print(" "+n[r][c]);
            }
            System.out.println();
        }
        System.out.println("sum of right diagonal ="+sum);
    }
}