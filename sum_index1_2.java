import java.util.*;
class mytest
{
    public static void main(String[]a)
    {
        Scanner s=new Scanner(System.in);
        int i,sum=0;
        int n[] =new int[5];
        for(i=0;i<5;i++)
        {
        System.out.println("enter number=");
        n[i]=s.nextInt();
        } 
        sum=n[1]+n[2];
        System.out.println("sum ="+sum);
    }
}