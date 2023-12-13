import java.util.Scanner;
public class Booking {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the customer name");
        String name = s.nextLine();
        System.out.println("enter the customer address");
        String address = s.nextLine();
        System.out.println("enter the product name");
        String productname = s.nextLine();
        System.out.println("enter the product quantity");
        int productquantity = s.nextInt();
        System.out.println("enter product price");
        double productprice = s.nextDouble();
        double totalprice = productquantity * productprice;
        System.out.println("customer name:" + name);
        System.out.println("customer address:" + address);
        System.out.println("product name:" + productname);
        System.out.println("product quantity:" + productquantity);
        System.out.println("product price:" + productprice);
        System.out.println("total  price:" + totalprice);
    }
}