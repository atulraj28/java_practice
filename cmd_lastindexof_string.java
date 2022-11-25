import javax.swing.*;
class mytest
{
    public static void main(String[]a)
    {
        int i,j;
        String str1,str2;
        if(a.length==2)
        {
            str1=a[0];
            str2=a[1];
            j=str1.lastIndexOf(str2);
            if(j==-1)
            JOptionPane.showMessageDialog(null,"not found");
            else
            JOptionPane.showMessageDialog(null,"index of " + str2 +" in "+str1+" is "+j);
        }
        else
        JOptionPane.showMessageDialog(null,"only two strings are allowed");
    }
}