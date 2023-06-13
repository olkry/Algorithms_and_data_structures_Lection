import java.util.ArrayList;
import java.util.List;

public class Task001 {

    public static void main(String[] args) {
        List<Integer> avalableDivider = findAvalableDivider(999);
        for (Integer integer : avalableDivider) {
            System.out.println(integer);
        }
    }
// Этот метод имеет прямую корелляцию O(n);
    public static List<Integer> findAvalableDivider(int number) {
        int counter = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            counter++;
            if (number % i == 0) {
                result.add(i);
            }
        }
        System.out.println("Counter: " + counter);
        return result;
    }
}
