import java.util.Scanner;

public class Diagonals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j;
        StringBuilder stars = new StringBuilder();
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == j) {
                    stars.append("*");
                }
                else if (j == n - i - 1) {
                    stars.append("*");
                }
                else {
                    stars.append(" ");
                }

            }
            System.out.println(stars);
            stars = new StringBuilder();
        }
    }
}
