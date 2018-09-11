import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int a = 5;
        int b = 18;

        List<Integer> oddNumbers = getOddNumbers(a, b);
        for (int i = 0; i < oddNumbers.size(); i++) {
            System.out.println(oddNumbers.get(i));
        }

    }

    private static void printOddNumbers(int a, int b) {
        while (a < b) {
            if (a++ % 2 == 1) {
                System.out.println(a);
            }
        }
    }

    private static List<Integer> getOddNumbers(int a, int b) {
        List<Integer> oddNumbers = new ArrayList<>();
        while (a < b) {
            if (++a % 2 == 1) {
                oddNumbers.add(a);
            }
        }
        return oddNumbers;
    }

    private static int getSumNumbers(int a, int b) {
        int result = 0;
        while (++a < b) {
            result += a;
        }
        return result;
    }

}