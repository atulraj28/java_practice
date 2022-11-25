import javax.swing.*;
class mytest
{
    public static void main(String[]a)
    {
       int i,j;
       String prime="";
       for(i=1;i<=100;i++)
       {
        int n=0;
        for(j=1;j<=100;j++)
        {
            if(i%j==0)
            n++;
        }
        if(n==2)
        prime=prime+i+" ";
       } 
       System.out.println(prime);
    }
}