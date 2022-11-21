import javax.swing.*;
class mytest
{
    public static void main(String[]a)
    {
      int i,c=0,n;
      for(i=0;i<a.length;i++)
      {
        n=Integer.parseInt(a[i]);
        if(n%2==0)
        c++;
      }
      System.out.println("even number ="+c);
    }
}