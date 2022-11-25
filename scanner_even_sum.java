import java.util.*;
class mytest
{
    public static void main(String []a)
    {
        Scanner s=new Scanner(System.in);
        int i,j,sum=0;
        System.out.println("enter size of array");
        j=s.nextInt();
        int n[] =new int [j];
        for(i=0;i<j;i++)
        {
            System.out.println("enter a number");
            n[i]=s.nextInt();
             if(n[i]%2==0)
            {
                sum=sum+n[i];
            }
        }
        System.out.println(sum);
    }
}