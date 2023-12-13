package Prasanna;

 class A{
    synchronized void table(int n){
        for(int i=0;i<=10;i++)
        {
            System.out.println(i*n);


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        }
     }

class B extends Thread{
     A n;
     B(A n){
         this.n=n;
     }
     public void run()

     {
         n.table(5);
     }
 }
 class C extends Thread{
     A n;
     C(A n){
         this.n=n;
     }
     public void run()
     {
     n.table(60);
     }
 }
 class main{
     public static  void  main(String[]args){
        A obj=new A();
        B obj1=new B(obj);
        C obj2=new C(obj);
        obj1.start();
        obj2.start();
     }
 }

