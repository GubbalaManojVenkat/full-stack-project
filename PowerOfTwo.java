import java.util.Scanner;

public class PowerOfTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        String result = powerOfTwo(number);

        System.out.println(result);
    }

    public static String powerOfTwo(int n) {
        if (n < 0) {
            return "Number too small";
        }
        if (n > 32767) {
            return "Number too large";
        }
        if (isPowerOfTwo(n)) {
            return "Yes";
        } else {
            return "No";
        }
    }

    private static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}
