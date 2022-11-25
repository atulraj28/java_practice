import java.util.*;
class mytest
{
    public static void main(String []a)
    {
        Scanner s=new Scanner(System.in);
        int n[]=new int[5];
        int i,position=0,counter=0;
        for(i=0;i<5;i++)
        {
            System.out.println("enter numbers");
            n[i]=s.nextInt();
            if(n[i]==5)
            {
            position=i;
            counter++;
            }
        }    
        if(counter>0)   
        System.out.println("the index position ="+position);
        else
        System.out.println("5 is not present in the numbers");

    }
}