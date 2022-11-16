import javax.swing.*;
class even
{
	public static void main(String[]a)
	{
	int n;
	n=Integer.parseInt(JOptionPane.showInputDialog("enter a mnumber"));
	if(n%2==0)
	System.out.println("number is even");
	else
	System.out.println("number is not even");
	}
}