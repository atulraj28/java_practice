import javax.swing.*;
class mytest
{
    public static void main(String[]a)
    {
        int i,f=0;
        String str1,str2;
        for(i=1;i<=3;)
        {
        str1=JOptionPane.showInputDialog("Enter User Id");
        str2=JOptionPane.showInputDialog("Enter Password");
        if(str1.equalsIgnoreCase("get")&& str2.equals("project"))
        {
           f=1;
           break;
        }
        else
        {
        JOptionPane.showMessageDialog(null,(3-i)+" chance left");
        i++;
        JOptionPane.showMessageDialog(null,"Credentials are wrong");
        }
        }
        if(f==1)
         JOptionPane.showMessageDialog(null,"Welcome");
         if(i==4)
          JOptionPane.showMessageDialog(null,"times over");
    }
}
