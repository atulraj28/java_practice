import java.util.*;
class mytest
{
    public static void main(String []a)
    {
        Scanner s=new Scanner(System.in);
        int n[]=new int[5];
        int i,sum=0;
        for(i=0;i<5;i++)
        {
            System.out.println("Enter number =");
            n[i]=s.nextInt();
            if(n[i]%2!=0)
            sum=sum+n[i];
        }
        System.out.println("sum of odd number="+sum);
    }

}     