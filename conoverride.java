public class conoverride
{
    conoverride()
    {
        System.out.println("parent");
    }
}
 class child extends conoverride{
    child()
    {
       // super();
        System.out.println("child");
    }
void display(){
        System.out.println("display method");
       // super();

}
public static void main(String[]args)
        {
            child ks=new child();
            ks.display();
        }
}

