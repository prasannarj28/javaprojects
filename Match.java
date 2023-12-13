public class Match {
    String name;
    static int date=20;
    void day1(){
       String game="basketball";
        System.out.println(date+" " + game);
    }
    void day2(String name,int date){
        this.name=name;
        System.out.println(name+" "+date);
    }
    String day3(){
        String name="hulk";
        System.out.println(date+" " + name);
        return name;

    }
    String day4(String name,int date){
        System.out.println(name+" "+ date);
        return name;
    }

    public static void main(String[] args)
    {
        Match m=new Match();
        m.day1();
        m.day2("fool",20);
        m.day3();
        m.day4("wew", 11);
        System.out.println(m.name);
        System.out.println(m.day4("djhdh",82));
    }
}