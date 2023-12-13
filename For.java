/*import java.util.Scanner;
public class For {
        public static void main(String[] args){
            int num;
            Scanner scan=new Scanner(System.in);
            System.out.println("enter the number:");
             int i=scan.nextInt();

            if(i>0){
System.out.println("positive");
    }
            else if(i==0){
                System.out.println("zero");
            }
            else{
                System.out.println("negatie0");
            }
    }
}
	class Teststringcomparison4{
        public static void main(String args[]){
       String s1="Sachin";
       String s2="Sachin";
        String s3="Ratan";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s3.compareTo(s1));
        }
        	}

class Arraypass {
    String name;
    int abi;
    String arr[];
    Arraypass(String name,int abi, String subs[]){
        this.name = name;
        this.abi=abi;
        this.arr = subs;
    }
    public void display() {
        System.out.println("Name: "+this.name+this.abi);
        System.out.print("Subjects: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]) {
        String subs[] = {"Mathematics", "English", "Science", "Social"};
        Arraypass obj = new Arraypass("Krishna",98, subs);
        obj.display();
    }
}*/
 class JavaExceptionExample{
    public static void main(String args[]){
        try{

            int data=100/0;
        }catch(ArithmeticException e){System.out.println(e);}

        System.out.println("rest of the code...");
    }
}