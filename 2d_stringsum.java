import java.util.*;
class mytest
{
    public static void main(String[]a)
    {
        Scanner s=new Scanner(System.in);
        String [][]n=new String[2][3];
        int [][]x = new int[2][2];
        int r,c,sum,k;
        for(r=0;r<2;r++)
        {
            sum=0;
            for(c=0;c<2;c++)
            {
                System.out.println("enter strings");
                n[r][c]=s.next();
                k=n[r][c].length();
                sum=sum+k;
            }
            n[r][c]=String.valueOf(sum);


        }
         for(r=0;r<2;r++)
        {
            for(c=0;c<3;c++)
            {
                System.out.print(" "+n[r][c]);
            }
            System.out.println();
        }
    }
}