public class Agri {
    int id;
    String name;
    int salary;
    Enimy enimy;
    Agri(int id,String name,int salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

}
class Enimy {
    String city;
    String state;

    Enimy(String city, String state, Agri agri) {
        this.city = city;
        this.state = state;

    }

    public static void main(String args[]) {
        Agri a=new Agri(54643,"prasanna",12599);
        Enimy e=new Enimy("chennai","tamilnadu",a);
        System.out.println(e.city+" "+e.state+" "+a.name+" "+a.id+""+a.salary);


    }
}


