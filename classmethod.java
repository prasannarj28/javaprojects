public class classmethod {
    void m1(){
        System.out.println("hello");
    }
}
class  name extends classmethod{
    void m2(){
        System.out.println("bye");
    }
}
class name1 extends name{
    void m3(){
        System.out.println("good");
    }//method ovr loading
}
class name2 extends name1{

    void m4() {
        System.out.println("raj");
    }
        public static void main(String[]args){
            name2 obj=new name2();
            obj.m1();
            obj.m3();
            obj.m4();
        }

    }


