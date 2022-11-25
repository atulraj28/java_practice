import java.util.*;
class mytest
{
    public static void main(String[]a)
    {
        Scanner s= new Scanner(System.in);
        int n[]=new int[5];
        int i,ecount=0,ocount=0;
        for (i=0;i<5;i++)
        {
            System.out.println("enter number=");
            n[i]=s.nextInt();
            if(n[i]%2==0)
            ecount++;
            else
            ocount++;
        }
        System.out.println("Total count of even="+ecount);
        System.out.println("Total count of odd="+ocount);

    }
}