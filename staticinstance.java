public class staticinstance {
    static int count;
    String name;
    staticinstance(String food)
    {
        count++;
        System.out.println(food);
    }
    public static void main(String[]args){
        staticinstance s=new staticinstance("idly");
        staticinstance s1=new staticinstance("biriany");
        staticinstance s2=new staticinstance("dhosa");
        staticinstance s3=new staticinstance("mealse");
        System.out.println(count);
    }

}
