import java.util.*;
class mytest
{
    public static void main(String []a)
    {
        int n[]=new int[5];
        Scanner s=new Scanner(System.in);
        int i;
        for(i=0;i<5;i++)
        {
            System.out.println("Enter a number =");
            n[i]=s.nextInt();

        }
        for(i=0;i<5;i++)
        {
            System.out.println(n[i]);
        }
    }
}
