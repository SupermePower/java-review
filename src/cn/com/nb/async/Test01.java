package cn.com.nb.async;

import java.util.concurrent.CompletableFuture;

/**
 * @description 异步编程
 * @author: liying.fu
 * @Date: 2018/8/31 下午11:40
 */
public class Test01 {


    public static void main(String[] args) throws Exception {
        long startTime = System.currentTimeMillis();
        CompletableFuture<Integer> integerCompletableFuture = CompletableFuture.supplyAsync(() -> test());
        CompletableFuture<Integer> integerCompletableFuture1 = CompletableFuture.supplyAsync(() -> test());
        CompletableFuture<Integer> integerCompletableFuture2 = CompletableFuture.supplyAsync(() -> test());
        integerCompletableFuture.get();
        integerCompletableFuture1.get();
        integerCompletableFuture2.get();
        System.out.println((System.currentTimeMillis() - startTime)/1000);
    }

    /**
     * 测试
     * @throws Exception
     */
    public static int test() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
