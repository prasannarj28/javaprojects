public class CopyConstructor {

    int id;
    String name;
    CopyConstructor(int i,String n)
    {
        id=i;
        name=n;
    }
    CopyConstructor(){

    }
    void display()
    {
        System.out.println(id+" "+name);
    }
    public static void main(String[]args)
    {
        CopyConstructor s1=new CopyConstructor(111,"raj");
        CopyConstructor s2=new CopyConstructor();
        s2.id=s1.id;
        s2.name=s1.name;
        s1.display() ;
        s2.display();
    }
}
