import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*class Ready{

        public static void main(String[] args) {

            ArrayList<Object> al=new ArrayList<>();
            al.add(20);
            al.add("vimala");
            al.add('c');
            al.add(3.4);
            System.out.println(al);

            for(Object a:al)
            {
                System.out.println(a);
            }


        }
    }
class Mobile {
    private int mobileId;
    private String brand;

    public Mobile(int mobileId, String brand) {
        this.mobileId = mobileId;
        this.brand = brand;
    }

    public int getMobileId() {
        return mobileId;
    }

    public String getBrand() {
        return brand;
    }
}

class Laptop {
    private int laptopId;
    private String brand;

    public Laptop(int laptopId, String brand) {
        this.laptopId = laptopId;
        this.brand = brand;
    }

    public int getLaptopId() {
        return laptopId;
    }

    public String getBrand() {
        return brand;
    }
}

class IteratorBrand {
    public static void main(String[] args) {
        ArrayList<Mobile> m = new ArrayList<>();
        ArrayList<Laptop> l = new ArrayList<>();

        m.add(new Mobile(1, "BrandX"));
        l.add(new Laptop(101, "BrandX"));
        m.add(new Mobile(2, "BrandY"));
        l.add(new Laptop(102, "BrandX"));
        m.add(new Mobile(3, "BrandX"));
        m.add(new Mobile(4, "BrandX"));
        l.add(new Laptop(103, "BrandY"));
        String targetBrand = "BrandX";
        for (Mobile mob : m) {
            if (mob.getBrand().equals(targetBrand)) {
                System.out.println("Mobile ID: " + mob.getMobileId() + ", Brand: " + mob.getBrand());
            }
        }
        for (Laptop lap : l) {
            if (lap.getBrand().equals(targetBrand)) {
                System.out.println("Laptop ID: " + lap.getLaptopId() + ", Brand: " + lap.getBrand());
            }
        }
    }
}*/
/*public class Ready{
    Ready r;
    public  static  void main(String args[]){
        Ready q=new Ready();
        Ready q1=new Ready();
        Ready q3=new Ready();
        q.r=q1;
        q1.r=q3;
        q3.r=q;

        System.out.println(q+" "+q1+" "+q3);

    }
}*/
class Ready{
    void sample()
    {
        System.out.println("hhy");
    }
    void ant(){
        System.out.println("i7uig");
    }
    public void finalize(){
        System.out.println("garbage cood");
    }
    public static void main(String args[]){//garbage collection
        Ready r=new Ready();
        r.sample();
        r.ant();
       // r=null;
        r.finalize();
        System.gc();
    }
}





