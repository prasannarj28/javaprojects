public class thismethod {
    public static void main(String[]args){
        System.out.println();
        thismethod obj=new thismethod();
        obj.name();
    }
    void name()
    {
        System.out.println("school friends vicky arun");
        this.name1(3);
    }
    void name1(int a)
    {
        System.out.println("college friends suresh praveen");
        this.name2("raj",4);
    }
    void name2(String a,int b)
    {
        System.out.println("unq friends ram lokesh");

    }
}

