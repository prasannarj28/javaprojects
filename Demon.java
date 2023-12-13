package Prasanna;

/*class Demon extends Thread {
    public void run() {
        while (true) {
            System.out.println("raj");
        }
    }
}

class Abacus extends Thread {
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("*");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Demon d = new Demon();
        Abacus a = new Abacus();
        d.setDaemon(true);
        a.start();
        d.join();
        d.start();

        for(int j=0;j<4;j++){
            System.out.println("&&&&&&&");
        }
    }
}*/
class raj
{
    int id;
    String name;
    void kumar(int l,String v){
         id=l;
         name=v;



}
}
class nbn{
    public static void main(String[] args) {
        raj m=new raj();
        m.kumar(3,"rer");
        System.out.println(m.id+" "+m.name);



    }
}





