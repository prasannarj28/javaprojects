class methodoverride {
    void display()
    {
        System.out.println("hello");
    }
}
class test extends methodoverride{
    void display()
    {

        System.out.println("good");//method over ride program only parent class print
        super.display();
    }
    void display1(){
        super.display();
    }

    public static void main(String[]args){
        test obj=new test();
        obj.display1();
    }
}