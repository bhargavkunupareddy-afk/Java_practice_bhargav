import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ThreadExample{
  
  static int division(int a, int b) {
   int c =a/b;
   return c;
  }

  public static void main(String [] args){

    int a =10;
    int b=5;
  
    ExecutorService executor = Executors.newFixedThreadPool(2);

    CompletableFuture <Integer>  addition = CompletableFuture.supplyAsync(
      ()-> a+b, executor
    );
    CompletableFuture <Integer> subt= CompletableFuture.supplyAsync(()-> a-b, executor);
    CompletableFuture <Integer> mul= CompletableFuture.supplyAsync(()-> a*b, executor);
    CompletableFuture <Integer> div= CompletableFuture.supplyAsync(()-> division(a,b), executor);
    CompletableFuture.allOf(addition,subt,mul,div).join();
    System.out.println("Addintion :"+ addition.join());
    System.out.println("Subtraction :"+ subt.join());
    System.out.println("Multiplication :"+ mul.join());
    System.out.println("division :"+ div.join());
    executor.shutdown();
  }
}

