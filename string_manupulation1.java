import javax.swing.*;
class test
{
    public static void main(String[]a)
    {
        String s,sl,su;
        int l;
        s=JOptionPane.showInputDialog("Enter a string");
        sl=s.toLowerCase();
        JOptionPane.showMessageDialog(null,"LowerCase="+sl);
        su=s.toUpperCase();
        JOptionPane.showMessageDialog(null,"upperCase="+su);
    }
}