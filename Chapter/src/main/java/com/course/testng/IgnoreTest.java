package com.course.testng;

import org.testng.annotations.Test;

public class IgnoreTest {

    @Test
    public void ignoreTest1(){
        System.out.println("ignoretest1 执行了！");
    }

    @Test(enabled = false)
    public void ignoreTest2(){
        System.out.println("ignoretest2 执行了！");
    }

    @Test(enabled = true)
    public void ignoreTest3(){
        System.out.println("ignoretest3 执行了");
    }
}
