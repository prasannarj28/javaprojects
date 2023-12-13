
class heirarical
{
    void somu()
    {
        System.out.println("this is granpa");
    }
}
class father extends heirarical
{
    void ravi()
        {
            System.out.println("this is father");
        }
}
class son extends heirarical {
    void prasanna()
    {
        System.out.println("this is son");
    }

    public static void main(String[] Args)
    {
        father f = new father();
        f.ravi();
        f.somu();


    }
}
