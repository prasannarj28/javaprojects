package Uniq;

public class Downcast {
    public static void main(String[]args){
        A a=new B();
        A a1=new C();
       A a2=new D();

        B b=(B)a;
        C c=(C)a1;
        D d=(D)a2;
        c.dsp();
        d.play();
        a.play();
    }
}
class A{
    void play(){
        System.out.println("hello");
    }
}
class B extends A{
    void play(){
        System.out.println("name");
    }
    void pk(){
        System.out.println("dmk");
    }
}
class C extends A{
    void play(){

        System.out.println("weight");
    }
    void dsp(){
        super.play();
        System.out.println("admk");
    }
}
class D extends A{
    void play(){
        super.play();
        System.out.println("height");

    }
}
