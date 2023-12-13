package Prasanna;

public class Collect {
    public static void main(String[]args)
    {
        String s=new String("ram");
        String s1="ram";
        s1="prasam";
        System.out.println(5+4);
        System.out.println(s.toLowerCase());
    }
}

/*public class Collect {
    static int Collect(String string)
    {
        int count=0;

        char ch[]= new char[string.length()];
        for(int i=0;i<string.length();i++)
        {
            ch[i]= string.charAt(i);
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String string ="    India Is My Country";
        System.out.println(Collect(string) + " words.");
    }
}*/