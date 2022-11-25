import java.util.*;
class mytest
{
    public static void main(String []a)
    {
        Scanner s=new Scanner(System.in);
        int n[]=new int[5];
        int i,position=0,counter=0;
        for(i=0;i<5;i++)
        {
            System.out.println("Enter number =");
            n[i]=s.nextInt();
        }
        System.out.println("In reverse order");
        for(i=4;i>=0;i--)
        {
            System.out.println(n[i]);
        }
    }
}     