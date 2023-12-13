import java.util.Scanner;
public class Calculator{
    public static void main(String[] args)
    {
        int First_Number,Second_Number;
        int Result = 0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the First Number:");
        First_Number=input.nextInt();
        System.out.println("Enter the second Number:");
        Second_Number = input.nextInt();
        System.out.println("Choose the action : \nAddition \nSubtraction \nMultiplication \nDivision");
        String operator = input.next();
        System.out.println("Result:");
        switch (operator)
        {
            case "Addition":
                Result = First_Number + Second_Number;
                System.out.println(First_Number + " " + operator + " " + Result);
            case "Subtraction":
                Result = First_Number - Second_Number;
                System.out.println(First_Number + " " + operator + " " + Result);
                break;
            case "Multiplication":
                Result = First_Number + Second_Number;
                System.out.println(First_Number + " " + operator + " " + Result);
                break;
            case "Division":
                Result = First_Number / Second_Number;
                System.out.println(First_Number + " " + operator + " " + Result);
                break;
        }
    }
}








