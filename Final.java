class Final {
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }
}
    class raj extends Final{
       public static void main(String[]args)
       {
           System.out.println(add(2,3));
           System.out.println(add(5,7,9));
       }
   }


