import java.util.Scanner;

public class findMax {
    public static void main(String[] args) {
        System.out.println("Find max value of 3 values");
        System.out.println("---------------------------");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter v1 : ");
        int v1 = Integer.parseInt(scan.nextLine());
        System.out.print("Enter v2 : ");
        int v2 = Integer.parseInt(scan.nextLine());
        System.out.print("Enter v3 : ");
        int v3 = Integer.parseInt(scan.nextLine());
        int Max;
        if(v1 < v2){
            if(v2 > v3){
                Max = v2;
            }else{
                Max = v3;
            }
        } else if(v1 > v3){
             Max = v1;
        }else {
            Max = v3;
        }
        System.out.println("----------");
        System.out.println("v1 : "+ v1);
        System.out.println("v2 : "+ v2);
        System.out.println("v3 : "+ v3);
        System.out.println("----------");
        System.out.println("Max number is : " + Max);

    }

}

