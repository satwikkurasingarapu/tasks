package com.task3.multithreading;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsyncTask {

    @Async
    public void asyncMethod(){
        try{
            Thread.sleep(3000);

        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("My Name "+Thread.currentThread().getName());
    }
}
