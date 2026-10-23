package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadAnnotion {

    // invocationCount : 执行的次数（如下：这个方法要执行 10 次）
    // threadPoolSize : 线程次数（如下：由 3 个线程并发执行）
    @Test(invocationCount = 10, threadPoolSize = 3)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread Id : %s%n", Thread.currentThread().threadId());
    }
}
