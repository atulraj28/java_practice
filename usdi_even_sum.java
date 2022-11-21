import javax.swing.*;
class mytest
{
    public static void main(String[]a)
    {
      int i,s=0,n;
      for(i=0;i<a.length;i++)
      {
        n=Integer.parseInt(a[i]);
        if(n%2==0)
        s=s+n;
      }
      System.out.println("sum ="+s);
    }
}