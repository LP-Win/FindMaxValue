import java.util.Scanner;

public class ractangleCalculate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Value b: ");
        int b = Integer.parseInt(scan.nextLine());

        System.out.print("Enter Value h: ");
        int h = Integer.parseInt(scan.nextLine());

        int total = (h*b) / 2;

        System.out.println("The Result is : " + total);
    }
}
