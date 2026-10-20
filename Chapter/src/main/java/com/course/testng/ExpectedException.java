package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedException {

    /**
     * 什么时候使用异常测试？
     * 在我们期望结果是某个异常时
     * 比如：传入某些不合法的参数时，程序抛出一个异常
     * 这个异常就是我们的预期结果
     */

    // 通过expectedExceptions 属性来进行异常测试
    // 这是一个失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }

    // 这是一个成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是一个成功的异常测试");
        throw new RuntimeException();
    }

}
