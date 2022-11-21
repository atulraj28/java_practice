import javax.swing.*;
class mytest
{
    public static void main(String[]a)
    {
      int i,j,n,m,s=0;
      for(i=0;i<a.length;i++)
      {
        n=Integer.parseInt(a[i]);
        for (j=0;j<a.length;j++)
        {
            m=Integer.parseInt(a[j]);
            if(n>m)
            {
            n=m;
            s=m;
            }
        }

      }
      System.out.println("lowest ="+s);
    }
}