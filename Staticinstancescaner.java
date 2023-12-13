/*import java.util.Scanner;

public class Staticinstancescaner {
    static int count;
    String name;
    Staticinstancescaner(String food)
    {
        count++;
        System.out.println(food);
    }
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the food name:");
        String x=scan.nextLine();
        System.out.println("enter the food name:");
        String y=scan.nextLine();
        System.out.println("enter the food name:");
        String z=scan.nextLine();
        System.out.println("enter the food name:");
        String d=scan.nextLine();
        System.out.println("food name:"+d"+"+x"+"+y"+"+z);
System.out.println(count);*/

class Staticinstancescaner{
    static int add(int a,int b){return a+b;}
        static int add(int a,int b,int c){return a+b+c;}


        public static void main(String[]args){
        System.out.println(Staticinstancescaner.add(11,11));
        System.out.println(Staticinstancescaner.add(11,11,11));
        }
}


