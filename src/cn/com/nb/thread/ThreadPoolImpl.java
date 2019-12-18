package cn.com.nb.thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class ThreadPoolImpl<Job extends Runnable> implements ThreadPool<Job> {

    //默认连接数
    private static final int DEFAULT_WORKER_NUMBERS = 5;
    //最大连接数
    private static final int MAX_WORKER_NUMBERS = 10;
    //默认连接数
    private static final int MIN_WORKER_NUMBERS = 1;
    //工作列表，客户端发起的工作
    private final LinkedList<Job> jobs = new LinkedList<>();
    //工作者列表
    private final List<Worker> workers = Collections.synchronizedList(new ArrayList<>());
    //工作者线程数量
    private int workerNumbers;
    //为每个工作者线程生成编号
    private AtomicLong threadNumber = new AtomicLong();

    public ThreadPoolImpl() {
        this.workerNumbers = DEFAULT_WORKER_NUMBERS;
        initializeWorkers(this.workerNumbers);
    }

    public ThreadPoolImpl(int workerNumbers) {
        if (workerNumbers > MAX_WORKER_NUMBERS) {
            this.workerNumbers = MAX_WORKER_NUMBERS;
        } else {
            this.workerNumbers = workerNumbers;
        }
        initializeWorkers(this.workerNumbers);
    }

    /**
     * 初始化每个工作者线程
     * @param numbers
     */
    private void initializeWorkers(int numbers) {
        for (int i = 0; i < numbers; i++) {
            Worker worker = new Worker();
            workers.add(worker);//添加至工作者列表
            Thread thread = new Thread(worker);
            thread.start();//启动工作者线程
        }
    }

    /**
     * 执行job
     *
     * @param job
     */
    public void execute(Job job) {
        if (job != null) {
            synchronized (jobs) {
                jobs.addLast(job);
                jobs.notify();
            }
        }
    }

    /**
     * 增加工作者至线程池
     *
     * @param num
     */
    @Override
    public void addWorkers(int num) {

    }

    /**
     * 从线程池中移除工作者
     *
     * @param num
     */
    @Override
    public void removeWorkers(int num) {

    }


    /**
     * 关闭线程池
     */
    public void shutDown() {
        for (Worker worker : workers) {
            worker.shutDown();
        }
    }

    /**
     * 获取等待执行的线程
     *
     * @return
     */
    @Override
    public int getJobSize() {
        return workers.size();
    }

    class Worker implements Runnable {

        private volatile boolean running = true;

        @Override
        public void run() {
            while (running) {
                Job job = null;
                synchronized (jobs) {
                    if (jobs.isEmpty()) {
                        try {
                            jobs.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                            Thread.currentThread().interrupt();//中断当前线程
                            return;
                        }
                    }
                    job = jobs.removeFirst();
                }
                if (job != null) {
                    job.run();
                }
            }
        }

        /**
         * 关闭线程池
         */
        public void shutDown() {
            running = false;
        }
    }
}
