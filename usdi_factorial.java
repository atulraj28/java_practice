import javax.swing.*;
class mytest
{
    public static void main(String[]a)
    {
       int i,f=1,n;
       n=Integer.parseInt(JOptionPane.showInputDialog("Enter the number for factorial "));
       for(i=n;i>0;i--)
       {
        f=f*i;
       }
       JOptionPane.showMessageDialog(null,"Factorial of "+n+" ="+f);
    }
}