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
public class deadlock  {
     public synchronized void f1(deadlock1 m2){
         System.out.println("m1启动");
         System.out.println("m2 启动");
         m2.f1();
     }
    public synchronized void f2(){
        System.out.println("m2方法启动");
    }
    public static void main(String[] args) {
        deadlock d1 = new deadlock();
        deadlock1 d2 = new deadlock1();

        new Thread(()->{
            d2.f2(d1);
        }).start();
        new Thread(()->{
            d1.f1(d2);
        }).start();
    }
}
