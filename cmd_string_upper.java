import java.util.*;
class mytest
{
    public static void main(String []a)
    {
        String n[]=new String[a.length];
        int i;
        for(i=0;i<a.length;i++)
        n[i]=a[i].toUpperCase();
        
        for(i=0;i<a.length;i++)
        {    
            System.out.println(n[i]);
        }
    }

}