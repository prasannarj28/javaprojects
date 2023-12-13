package Prasanna;

/*import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Vcolle {

    public static void main(String[]args){
        ArrayList prra=new ArrayList<>();
                prra.add(13);
                prra.add("gg");
                prra.set(1,100);
        prra.addAll(prra);
        prra.remove(0);
       // prra.size(prra.add);
        prra.contains()
        System.out.print(prra);

    }


    }
class Vcoole{
    Integer id;
    String name;
    Vcoole(Integer id,String name)
    {
        this.id=id;
        this.name=name;
    }

    class votka{
        int id;
        String name;
        votka(int id,String name) {
            this.id = id;
            this.name = name;
        }
        }
        public String toString(){
            return name+id;
        }

    public static  void main(String  args[]){
        ArrayList ai=new ArrayList<>();
        ai.add(new Vcoole(1,"iuuu"));
        ai.add(new votka(2,"TY"));
        System.out.println(ai);
    }
}*/

public class Vcolle{
    int id;
    String name;
    Vcolle(int n,String b){
        id=n;
        name=b;
    }
    Vcolle(Vcolle c){
        id=c.id;
        name=c.name;
    }
    void display(){
        System.out.println(id+" "+name);
    }
    public static void main(String args[]){
        Vcolle v=new Vcolle(6,"ty");
        Vcolle v1=new Vcolle(v);
        v1.display();
        v.display();

    }
}



