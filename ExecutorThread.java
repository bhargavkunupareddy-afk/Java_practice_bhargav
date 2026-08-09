import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StudentMarksProcessing {

    public static void main(String[] args) {

        String studentName = "Rahul";
        int maths = 80;
        int java = 75;
        int database = 90;

        ExecutorService executor = Executors.newFixedThreadPool(4);

        // Calculate Total Marks
        CompletableFuture<Integer> totalMarks =
                CompletableFuture.supplyAsync(
                        () -> maths + java + database,
                        executor
                );

        // Calculate Average Marks
        CompletableFuture<Double> averageMarks =
                CompletableFuture.supplyAsync(
                        () -> (maths + java + database) / 3.0,
                        executor
                );

        // Find Highest Mark
        CompletableFuture<Integer> highestMark =
                CompletableFuture.supplyAsync(
                        () -> Math.max(maths, Math.max(java, database)),
                        executor
                );

        // Determine Pass/Fail
        CompletableFuture<String> result =
                CompletableFuture.supplyAsync(
                        () -> {
                            if (maths >= 35 && java >= 35 && database >= 35) {
                                return "PASS";
                            }
                            return "FAIL";
                        },
                        executor
                );

        // Wait for all tasks to complete
        CompletableFuture.allOf(
                totalMarks,
                averageMarks,
                highestMark,
                result
        ).join();

        // Display Output
        System.out.println("Student: " + studentName);
        System.out.println("Total: " + totalMarks.join());
        System.out.printf("Average: %.2f%n", averageMarks.join());
        System.out.println("Highest: " + highestMark.join());
        System.out.println("Result: " + result.join());

        executor.shutdown();
    }
}
