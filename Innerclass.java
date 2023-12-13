//public class Innerclass {
//    private int a=10;
//     Innerclass(
//
//     )
//    {
//     System.out.println("outer method") ;
//    }
// class inner{
//    void method(){
//        System.out.println("inner method") ;
//    }

//    public static void main(String[]args){
//        Innerclass obj=new Innerclass();
//        Innerclass.inner aa= new inner();
//        aa.method();
//        System.out.println("main method") ;
//    }
//    }
//}
/*public class Innerclass{
    public static void main(String[] args) {
        int a = 100;
        Integer a1 = Integer.valueOf(a);
        System.out.println(a1);
        Short s=10;
        short s1=s.shortValue();
        short s2=s;
        System.out.println(s);
    }
}*/
class Innerclass{
    public static void main(String[] args) {
        int[] arr = {10,8,7,6,5,3,2,9};
        int i;
        for(i=0;i<arr.length;i++){
            arr[i]+=arr[i];
        }System.out.print(arr[i]+" ");
    }
}