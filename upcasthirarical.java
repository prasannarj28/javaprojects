public class upcasthirarical {
    int raj()
    {
        return 0;
    }
}
class B extends upcasthirarical{
    int raj()
    {
        return 10;
    }
}
class C extends upcasthirarical{
    int raj()
    {
        return 20;
    }
}
class D extends upcasthirarical{
    int raj()
    {
        return 30;//hirarical up casting
    }
}
class poly{
    public static void main(String[]args)
    {
        upcasthirarical obj;
        obj=new B();
        System.out.println("A rate intrest:"+obj.raj());
        obj=new C();
        System.out.println("B rate intrest:"+obj.raj());
        obj=new D();
        System.out.println("D rate intrest:"+obj.raj());

    }
}