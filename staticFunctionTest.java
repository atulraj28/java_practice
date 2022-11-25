import java.util.*;
class staticFunctionTest
{
    static int x,y;
    public static void input()
    {
        x=10;
        y=20;
    }
    public static void output()
    {
        System.out.println("Sum="+(x+y));
    }
    public static void main(String[]a)
    {
        staticFunctionTest.input();
        staticFunctionTest.output();
        // input();
        // output();
    }
}