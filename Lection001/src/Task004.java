import java.util.concurrent.atomic.AtomicInteger;

public class Task004 {

    public static void main(String[] args) {
        AtomicInteger counter = new AtomicInteger(0);
        int fib = fib(16, counter);
        System.out.println("Fib number: " + fib);
        System.out.println("Counter: " + counter.get());
    }

    public static int fib(int position, AtomicInteger counter) {
        counter.incrementAndGet();
        if (position == 1 || position == 2) {
            return 1;
        }
        return fib(position - 1, counter) + fib(position - 2, counter);
    }
}
