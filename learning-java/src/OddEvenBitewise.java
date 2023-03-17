import java.util.Scanner;

public class OddEvenBitewise {

    public static void main(String[] args) {

        int num;

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        String numString = Integer.toBinaryString(num);
        System.out.println(numString);
        if (numString.charAt(numString.length()-1) == '0') {
            System.out.println("Even");
        }
        else { System.out.println("Odd"); }


    }


    public static class TernaryOperator {

        public static void main (String[] args){

            int a = 1;
            int b = 2;
            int result;

            //if ( a < b ) { result = a; }
            //else { result = b; }
            result = a < b ? a : b;

            System.out.println(result);

        }

    }
}
