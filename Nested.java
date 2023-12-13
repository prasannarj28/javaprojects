/*public class Nested {
    int id;
    String name;
    Nested(int i,String n)
    {
        id=i;
        name=n;
    }
    Nested(){}
    void display()
    {
        System.out.println(id+" "+name);
    }
    public static void main(String[]args)
    {
        Nested s1=new Nested(111,"raj");
        Nested s2=new Nested(s1.id,s1.name);
        s1.display() ;
        s2.display();
    }
}
public class Nested {
    int ist = 1;

    public static void main(String[] args) {

        Nested obj = new Nested();
        Nested obj1 = new Nested(obj1=obj+1);

        Nested obj2 = new Nested(obj2.ist);
        Nested obj3 = new Nested(obj3.ist);
        System.out.println(obj.ist);
    }
}*/
public class Nested {
    public static void main(String[] args) {
        int a=10,b=5,c=20;
        System.out.println(a<b&&a++<c);
        System.out.println(a);
        System.out.println(a<b&a++<c);
        System.out.println(a);
    }
}


