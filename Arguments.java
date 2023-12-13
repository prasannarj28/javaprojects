 class Arguments{
    public  void Add()
    {
        int a=5,b=7;
        System.out.println(a+b);
    }
    public void Subtract(int a,int b)
    {
      int c=a-b;
      System.out.println(c);
    }
    public int Multiply()
    {
        int a=5,b=7,c=a*b;
        return c;
    }
    public int Divided(int a,int b)
    {
        int c=a/b;
        return c;

    }
    public static void main(String[]args)
    {
        Arguments a=new Arguments();
                a.Add();
                a.Subtract(2,4);
                System.out.println(a.Multiply());
                System.out.println(a.Divided(3,5));


    }

 }