public class Methodsc {
    public static void main(String[]args)
    {
        Methodsc prasanna=new Methodsc();
        prasanna.m1();
    }
    void m1()
    {
        m1(5);
    }
    void m1(int a)
    {
        System.out.println(a+12);
        m1(5,6);
    }
    void m1(int a,int b)
    {
        System.out.println(a+b);
        m1("prasanna");
    }
    void m1(String a){
        System.out.println("Hello");
    }
}
