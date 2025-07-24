import java.util.Scanner;

public class circleCalculate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Value r : ");
        int r = Integer.parseInt(scan.nextLine());

        double PI = 3.14;
        double total = PI * (r*r);

        System.out.println("The Result is : " + total );

    }
}
