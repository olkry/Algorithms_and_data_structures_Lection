import java.util.ArrayList;
import java.util.List;

public class Task002 {

    public static void main(String[] args) {
        List<Integer> avalableDivider = findSimpleNumbers(100);
        for (Integer integer : avalableDivider) {
        System.out.println(integer);
        }
    }
// Этот метод имеет не прямую корелляцию O(n^2) из-за вложенного цикла for;
    public static List<Integer> findSimpleNumbers(int max) {
        int counter = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= max; i++) {
            boolean simple = true;
            for (int j = 2; j < i; j++) {
                counter++;
                if (i % j == 0) {
                    simple = false;
                    break;  // Без этого количество операций для 100 - 4851. 
                            // С ней - 1133. Уже хорошо.

                }
            }
            if (simple) {
                result.add(i);
            }
        }
        System.out.println("Counter: " + counter);
        return result;
    }

}
