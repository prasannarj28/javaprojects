package Prasanna;

class multilevelinheritance{
    void yema()
    {
     System.out.println("I'm Grandpa");
    }
}
class alma extends multilevelinheritance{
    void esha()
    {
        System.out.println("I'm father");
    }
}
class mala extends alma{
    void meal()
    {
     System.out.println("I'm child");
    }
    public static void main(String[]args)
    {
     alma b=new alma();
     b.esha();
     b.yema();
      mala a=new mala();
            a.yema();
      a.meal();
}
}
