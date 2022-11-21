import javax.swing.*;
class mytest
{
    public static void main(String[]a)
    {
      int i,s=0;
      for(i=0;i<a.length;i++)
      {
        s=s+Integer.parseInt(a[i]);
      }
      System.out.println("sum ="+s);
    }
}