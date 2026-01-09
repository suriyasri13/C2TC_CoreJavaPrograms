package com.tnsif.oopsconcept;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Task implements Runnable {
    private String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + 
                         " is executing " + taskName);
        try {
            // Simulate task execution
            TimeUnit.SECONDS.sleep(2);
            System.out.println(taskName + " completed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Executor {
    public static void main(String[] args) {
        
        // Create a fixed thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);
        
        System.out.println("Creating and submitting tasks...\n");
        
        // Submit 5 tasks to the executor
        for (int i = 1; i <= 5; i++) {
            Task task = new Task("Task " + i);
            executor.execute(task);
        }
        
     
        executor.shutdown();
        
        try {
            
            if (!executor.awaitTermination(60, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
            System.out.println("\nAll tasks completed!");
        } catch (InterruptedException e) {
            executor.shutdownNow();
            e.printStackTrace();
        }
    }
}
