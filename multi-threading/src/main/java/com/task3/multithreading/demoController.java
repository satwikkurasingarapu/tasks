package com.task3.multithreading;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class demoController {

    @Autowired
    private ThreadPoolTaskExecutor executor;

    @Autowired
    private AsyncTask asyncDemo;
    @GetMapping("/multithreading")
    public void callAsyncMethod(){
        asyncDemo.asyncMethod();

    }
    @GetMapping("/threadpooling")
    public void performtasks(){
        int numberOfTasks = 20;
        for(int i=0;i<numberOfTasks;i++){
            final int taskId = i;
            executor.execute(()->performTask(taskId));
        }
    }
    private void performTask(int taskId){
        try{
            Thread.sleep(2000);
            System.out.println("Task "+taskId+" completed by thread: "+Thread.currentThread().getName());
        }
        catch(Exception e){
            Thread.currentThread().interrupt();
        }
    }
}
