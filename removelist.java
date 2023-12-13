import org.w3c.dom.ls.LSOutput;

public class removelist {
    public static void main(String args[]) {

        int[] arr = new int[]{5, 3, 8, 7, 9, 0};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

            System.out.println("sum" + sum);
        }
    }

}
