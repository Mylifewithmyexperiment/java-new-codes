package demo;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleThreadPool {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newScheduledThreadPool(5);
        for (int i = 0; i < 10; i++) {
            Runnable worker = new ThreadPoolExecutor("" + i);
            executor.execute(worker);  // here it will execute the worker i.e, idle threads from the thread pool 
            // line by line 
            
             
          }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");
    }
}
