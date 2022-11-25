import java.util.*;
class arrayUsedWithStaticMethod
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
    public static void main(String []a)
    {
        int []num= new int[5];
        int i;
        input(num,5);
        for(i=0;i<5;i++)
        {
            System.out.println(num[i]);
        }
        
    }
}