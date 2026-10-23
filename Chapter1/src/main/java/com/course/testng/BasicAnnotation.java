package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    // @Test是最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.printf("Tread Id : %s%n", Thread.currentThread().threadId());
        System.out.println("Test测试方法1");
    }

    @Test
    public void testCase2(){
        System.out.printf("Tread Id : %s%n", Thread.currentThread().threadId());
        System.out.println("Test测试方法2");
    }

    @BeforeMethod
    public void  beforeMethod(){
        System.out.println("BeforeMethod在测试方法之前运行");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod在测试方法之后运行");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass是在类运行之前运行的方法");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass是在类运行之后运行的方法");
    }

    @BeforeSuite
    public void beferSuite(){
        System.out.println("BeforeSuite测试套件，是在BeforeClass之前运行的");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite测试套件，是在AfterClass之后运行的");
    }
}
