import java.util.*;
class arrayUsedWIthStaticMethod2
{
      public static void input(int n[], int sz)
    {
        Scanner s=new Scanner(System.in);
        int i;
        for(i=0;i<sz;i++)
        {
            System.out.println("enter a number");

            n[i]=s.nextInt();
        }
    }
    public static void output(int k[],int sz)
    {
        for(int i=0;i<sz;i++)
        {
            System.out.println(k[i]);
        }
        
    }
    public static void main(String []a)
    {
        int []x=new int[5];
        int []y=new int [3];
        input (x,5);
        input(y,3);
        System.out.println("first");

        output(x,5);
        System.out.println("second");
        output(y,3);
    }
}