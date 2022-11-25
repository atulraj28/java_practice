import javax.swing.*;
class mytest
{
    public static void main(String[]a)
    {
        String str1,str2;
        str1=JOptionPane.showInputDialog("Enter a string");
        str2=JOptionPane.showInputDialog("Enter a searching string");
        int x=str1.indexOf(str2);

        if(x==-1)
        JOptionPane.showMessageDialog(null,"matching not found");
        else
        JOptionPane.showMessageDialog(null,"matching found");

        
    }
}