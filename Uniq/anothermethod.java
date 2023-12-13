package Uniq;

public class anothermethod {
    int addi(){
        int a=5;
        int b=7;
        int f=a+b;
        return f;
    }
    void subt(){
        float t=20.2f;
        float x=18.8f;
        float z=t-x;
        System.out.println(z);
    }
    void kal(){
        String s="prasanna";
        int d=10;
        char c='a';
        System.out.println(s +" "+d+ " "+c);
    }

    void bag(){
        boolean gk=true;
        int q=8;
        float w=18.0f;
        System.out.println(gk+" "+q+" "+w);
    }
    public static void main(String args[]){
        anothermethod ak=new anothermethod();
        System.out.println(ak.addi());
        ak.bag();
        ak.kal();
        ak.subt();
    }
}
