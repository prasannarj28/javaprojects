/*interface god{
    void pray();
}
interface  temple{
    void visit();
}
class Main implements god,temple {
    public void pray() {
        System.out.println("ggggg");
    }

    public void visit() {
        System.out.println("tttyuu");
    }

    public static  void main(String[] args) {
        Main m = new Main();
        m.pray();
        m.visit();
    }
}

 */
interface pras{
    void a();
    void b();
    void c();
    void d();
}
interface pra{
    void e();
    void f();
    void g();
    void h();
}
  class raj implements pras,pra{

    public void a(){
        System.out.println("a");
    }
    public void b(){
        System.out.println("b");
    }
    public void c(){
        System.out.println("c");
    }
    public void d(){
        System.out.println("d");
    }
    public void e(){
        System.out.println("e");
    }
    public void f(){
        System.out.println("f");
    }
    public void g(){
        System.out.println("g");
    }
    public void h(){
        System.out.println("h");
    }

}
abstract class ra{
        abstract public void  v();
         void va(){
             System.out.println("dsds");
         }
}

class mm extends raj{
    public  static void main(String[]args){
        raj r=new raj();
        r.a();
        r.b();
        r.c();
        r.d();
        r.e();
        r.f();
        r.g();
        r.h();
    }
}