import java.util.Scanner;
public class methodmodi
{
    static int h,g,c;
    public int add()
    {
        c=h+g;
        return c;
    }
    public int sub()
    {
        c=h-g;
        return c;
    }
    public int multiply()
    {
        c=h*g;
        return c;
    }
    public  int division()
    {
        c=h/g;
        return c;
    }
    public static void main(String args[]){
        methodmodi modi = new methodmodi();
        Scanner bad=new Scanner(System.in);
    System.out.println("enter the first number:");
     h = bad.nextInt();
    System.out.println("enter the second number:");
     g=bad.nextInt();

        System.out.println(modi.add());
        System.out.println(modi.sub());
        System.out.println(modi.multiply());
        System.out.println(modi.division());
}

}
