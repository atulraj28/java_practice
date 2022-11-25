import java.util.*;
class cmdArrayUsedWIthStaticMethod3
{
       public static void input(String a[],String b[],int sz)
    {
        int i;
        for(i=0;i<sz;i++)
        {
            a[i]=b[i];
        }
    }
    public static void output(String k[],int sz)
    {
        for(int i=0;i<sz;i++)
        {
            System.out.println(k[i]);
        }
        
    }
    public static void main(String []k)
    {
        String s[]=new String[k.length];
        input(s,k,k.length);
        output(s,k.length);
    }

}