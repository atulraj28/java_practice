import javax.swing.*;
class positive_or_not
{
	public static void main (String []a)
	{
	int n;
	n=Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
	if(n>0)
	{
		System.out.println(n+"is +ve");
	}
	else
	{
		System.out.println(n+"is not +ve");
	}
	}
}