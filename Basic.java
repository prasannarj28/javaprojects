/*class Basic{
   public static void main(String args[]){
        Basic b=new Basic();
        b.add(5,6);
    }
    int s;
     int add(int n1,int n2){
        int s=n1+n2;
         System.out.println(s);
        return s;
     }
}*/
 class Basic{
     int nun;
     String n;
     float f;
     Basic(int a,String b){
         nun=a;
         n=b;

     }
     Basic(int a,String  b,float c){
         nun=a;
         n=b;
         f=c;
     }
     void display(){
         System.out.println(nun+" "+n+" "+f);
     }
     public static void main(String args[]){
         Basic b=new Basic(5,"YTT");
         b.display();

     }
}
