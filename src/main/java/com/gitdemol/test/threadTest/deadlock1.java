package com.gitdemol.test.threadTest;

import java.util.concurrent.TimeUnit;

/**
 * 描述: 【】
 *
 * @author: LiHY
 * @email: lihy@zssinyi.com
 * @date: 2019/12/17 10:32
 * @version: V1.0
 */
public class deadlock1 {
    public synchronized void f2(deadlock m1){
        System.out.println("m2启动");
        try {
            System.out.println("m1睡眠两秒");
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("m1 启动");
        m1.f2();
    }
    public synchronized void f1(){
        System.out.println("m1方法启动");
    }
    public static void main(String[] args) {

    }
}
