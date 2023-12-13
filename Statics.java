
package Prasanna;

class Arun{
    synchronized static void table(int n){
        for(int i=0;i<=10;i++)
        {
            System.out.println(i*n);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}

class Babu extends Thread{
    public void run()
    {
        Arun.table(5);
    }
}
class Carun extends Thread{

    public void run()
    {
        Arun.table(10);
    }
}
 class Statics1{
    public static  void  main(String[]args){

        Babu obj1=new Babu();
        Carun obj2=new Carun();
        obj1.start();
        obj2.start();
    }
}


