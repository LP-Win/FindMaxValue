import java.util.Scanner;

public class triangleCalculate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Value w: ");
        int w = Integer.parseInt(scan.nextLine());

        System.out.print("Enter Value l: ");
        int l = Integer.parseInt(scan.nextLine());

        int total = w * l;

        System.out.println("The Result is : " + total);

    }
}
