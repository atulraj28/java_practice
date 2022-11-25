import java.util.*;
class mytest
{
    public static void main(String []a)
    {
        int n[]=new int[a.length];
        int i,k;
        for(i=0;i<a.length;i++)
        {
            k=Integer.parseInt(a[i]);
            n[i]=k*k;
        }
        for(i=0;i<a.length;i++)
        {
            System.out.println(n[i]);
        }
    }
}