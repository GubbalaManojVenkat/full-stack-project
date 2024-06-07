import java.util.HashMap;
import java.util.Scanner;

public class FeedBack {

    static HashMap<Integer, Integer> feedback = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        if (size < 0) {
            System.out.println("Invalid array size");
            return;
        }

        int[] metlife = new int[size];
        int[] hardfort = new int[size];

        for (int i = 0; i < size; i++) {
            metlife[i] = sc.nextInt();
            if (metlife[i] < 0) {
                System.out.println("Invalid input");
                return;
            }
        }

        for (int i = 0; i < size; i++) {
            hardfort[i] = sc.nextInt();
            if (hardfort[i] < 0) {
                System.out.println("Invalid input");
                return;
            }
        }

        highestFeedBack(metlife, hardfort, size);

        for (int id : feedback.keySet()) {
            System.out.println(id + " " + feedback.get(id));
        }
    }

    public static void highestFeedBack(int[] metlife, int[] hardfort, int size) {
        for (int i = 0; i < size; i += 2) {
            int id = metlife[i];
            int metlifeFeedback = metlife[i + 1];

            if (feedback.containsKey(id)) {
                feedback.put(id, Math.max(feedback.get(id), metlifeFeedback));
            } else {
                feedback.put(id, metlifeFeedback);
            }
        }

        for (int i = 0; i < size; i += 2) {
            int id = hardfort[i];
            int hardfortFeedback = hardfort[i + 1];

            if (feedback.containsKey(id)) {
                feedback.put(id, Math.max(feedback.get(id), hardfortFeedback));
            } else {
                feedback.put(id, hardfortFeedback);
            }
        }
    }
}
