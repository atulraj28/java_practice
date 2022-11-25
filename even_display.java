import java.util.*;
class mytest
{
    public static void main(String []a)
    {
        Scanner s=new Scanner(System.in);
        int n[]=new int[5];
        int i;
        for(i=0;i<5;i++)
        {
            System.out.println("Enter number =");
            n[i]=s.nextInt();
        }
        System.out.println("Even number are");
        for(i=0;i<5;i++)
        {
            if(n[i]%2==0)
            System.out.println(n[i]);
        }
    }
}     