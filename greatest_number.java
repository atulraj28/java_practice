import javax.swing.*;
class greatest
{
	public static void main(String[]p)
	{
	int a,b,c,f;
	a=Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
	b=Integer.parseInt(JOptionPane.showInputDialog("Enter another number"));
	c=Integer.parseInt(JOptionPane.showInputDialog("Enter third number"));
	f=a;
	if(f<b)
	{
	f=b;
	}
	if(f<c)
	{
	f=c;
	}
	System.out.println(f+"is greatest");
	}
}
	
	