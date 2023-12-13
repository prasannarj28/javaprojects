/*import java.util.LinkedList;
import java.util.Iterator;
public class Comics {
    public static void main(String args[]){
        LinkedList<String> cars=new LinkedList<String >();
        Iterator<String>bike=cars.listIterator();
        cars.add("bmw");
        cars.add("benze");
        cars.push("prasaa");
        String s=cars.pop();

        cars.add("tata");
        cars.addFirst("mahindra");
        cars.addLast("ford");
        System.out.println(cars);
        System.out.println(cars.getFirst());
        System.out.println(s);
    }
}*/
class ran{
    public  static  void main(String args[]){
    String n="ood";
    String  m="";
    int b=n.length();
    for(int i=b-1;i>=0;i--){
        m+=n.charAt(i);
    }
    if(n.equalsIgnoreCase(m)){
        System.out.println("palindron");
    }else{
        System.out.println("not palindrom");
    }
    }
}