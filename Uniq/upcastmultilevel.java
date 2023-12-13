package Uniq;

class upcastmultilevel{
    void eat(){
        System.out.println("eat");//multilevel inheritance upcasting
    }
}
class mok extends upcastmultilevel{
    void eat(){
        System.out.println(" drink");
    }
}
class cat extends mok{
    void eat(){
        System.out.println("fruit");
    }
    public static void main(String[]args){
        upcastmultilevel a1,a2,a3;
        a1=new upcastmultilevel();
        a2=new mok();
        a3=new cat();
        a1.eat();
        a2.eat();
        a3.eat();
    }
}

