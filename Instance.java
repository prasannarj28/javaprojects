public class Instance {
    public static void main(String[]args)
    {
        Instance obj=new Instance();
        System.out.println("THE SUM IS:"+" "+obj.add(12,13));
    }
    int s;
    public  int add(int a,int b)
    {
        s=a+b;
        return s;
    }
}
