import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class SalaryCounter {
    public static int countRepeaters(int[] salaries, int size) {
        if (size < 0) {
            System.out.println("Invalid Input");
            return -1;
        }
        for (int salary : salaries) {
            if (salary < 0) {
                System.out.println("Invalid Input");
                return -1;
            }
        }
        Map<Integer, Integer> salaryCount = new HashMap<>();
        for (int salary : salaries) {
            salaryCount.put(salary, salaryCount.getOrDefault(salary, 0) + 1);
        }
        int repeatCount = 0;
        for (int count : salaryCount.values()) {
            if (count > 1) {
                repeatCount = count;
                break; // Since we assume utmost one element would repeat
            }
        }
        return repeatCount;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int size = scanner.nextInt();
        if (size < 0 || size > 20) {
            System.out.println("Invalid Input");
            return;
        }
        int[] salaries = new int[size];
        System.out.println("Enter the salaries of employees: ");
        for (int i = 0; i < size; i++) {
            salaries[i] = scanner.nextInt();
            if (salaries[i] < 0) {
                System.out.println("Invalid Input");
                return;
            }
        }
        int result = countRepeaters(salaries, size);
        if (result != -1) {
            System.out.println(result);
        }
        scanner.close();
    }
}