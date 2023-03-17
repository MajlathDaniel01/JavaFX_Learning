import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num < 0) {System.out.println("Negative");}
        else if (num == 0) {System.out.println("Neither Positive nor Negative");}
        else {System.out.println("Positive") ;}

    }

}
