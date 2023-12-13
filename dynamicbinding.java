public class dynamicbinding {
    void show()
    {
        System.out.println("parent");
    }
}
class animal extends dynamicbinding{
    void show()
    {
        System.out.println("child1");
    }
}
class dog extends dynamicbinding {
    void show() {
        System.out.println("child2");
    }
}
class tree extends dynamicbinding {
    void show() {
        System.out.println("child3");
    }

    public static void main(String[] args) {
        dynamicbinding ss;
        ss = new animal();
        ss.show();
        ss = new dog();
        ss.show();
        ss = new tree();
        ss.show();
    }
}


