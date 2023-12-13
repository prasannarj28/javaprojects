public class Hello
{
     int m;
    public  void Hello()
    {
        System.out.println("this is without parameter");
    }
     public  void Hello(int a)
    {
        m=a;
        System.out.println(m+7);

    }
     public static void Hello(int a,int b)
    {
        System.out.println("this is with parameter");
    }
    public static void main(String[] args)
    {
        Hello h=new Hello();
       h. Hello();
        h.Hello(5);
        h.Hello(4,6);
    }
}
