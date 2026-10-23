package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class MultiTreadOnXml {

    @Test
    public void test1(){
        System.out.printf("Tread Id : %s%n", Thread.currentThread().threadId());
    }

    @Test
    public void test2(){
        System.out.printf("Tread Id : %s%n", Thread.currentThread().threadId());
    }

    @Test
    public void test3(){
        System.out.printf("Tread Id : %s%n", Thread.currentThread().threadId());
    }
}
