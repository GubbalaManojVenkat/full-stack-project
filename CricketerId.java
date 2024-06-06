import java.util.ArrayList;
import java.util.Scanner;

public class CricketerId{

    static ArrayList<Integer> cricketer = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        if (size < 0) {
            System.out.println("Invalid array size");
            return;
        }

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
            if (array[i] < 0) {
                System.out.println("Invalid input");
                return;
            }
        }

        int score = sc.nextInt();
        if (score < 0) {
            System.out.println("Invalid score");
            return;
        }

        findCricketerId(array, size, score);

        for (int id : cricketer) {
            System.out.println(id);
        }
    }

    public static void findCricketerId(int[] array, int size, int score) {
        for (int i = 0; i < size; i += 2) {
            int id = array[i];
            int cricketerScore = array[i + 1];
            if (cricketerScore > score) {
                cricketer.add(id);
            }
        }
    }
}
