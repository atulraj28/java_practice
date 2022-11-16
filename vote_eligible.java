import javax.swing.*;
class vote
{
	public static void main(String []a)
	{
	int x;
	x=Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
	if(x>=18)
	System.out.println("you are eligible for voting");
	else
	System.out.println("not eligible for voting");
	}
}