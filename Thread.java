import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ParallelNumberCalculator {

    public static void main(String[] args) {

        int number = 5;

        ExecutorService executor = Executors.newFixedThreadPool(3);

        CompletableFuture<Boolean> primeFuture =
                CompletableFuture.supplyAsync(() -> isPrime(number), executor);

        CompletableFuture<Long> factorialFuture =
                CompletableFuture.supplyAsync(() -> factorial(number), executor);

        CompletableFuture<Integer> squareFuture =
                CompletableFuture.supplyAsync(() -> number * number, executor);

        CompletableFuture.allOf(
                primeFuture,
                factorialFuture,
                squareFuture
        ).join();

        System.out.println("Prime: " + primeFuture.join());
        System.out.println("Factorial: " + factorialFuture.join());
        System.out.println("Square: " + squareFuture.join());

        executor.shutdown();
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static long factorial(int n) {
        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
