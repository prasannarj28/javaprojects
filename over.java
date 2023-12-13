public class over {
    public static void main(String[] args) {
        over f = new over();

        System.out.println(f.raj((short) 5, (short) 1, (short) 9));

        f.raj((short) 5, (short) 1, (short) 9);
        f.raj(20.2f, 18.8f);
        f.raj("prasaana", 10, 'h');
        f.raj(false, "==+j9h", 18.8f);
    }

    short raj(short a, short b, short c) {
        short d;
        d = (short) (a + b + c);
        return d;
    }

    void raj(float appa, float baba) {
        float c = appa - baba;
        System.out.println(c);
    }

    void raj(String a, int b, char c) {
        System.out.println(a + b + c);
    }

    void raj(boolean a, String b, float c) {

        System.out.println(a + b + c);
    }
}

