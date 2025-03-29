package org.logical.multithreading;

import java.util.concurrent.BlockingQueue;

public class BlockingProducer implements Runnable{
    private final BlockingQueue<Integer> queue;

    public BlockingProducer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            for (int i = 1; i < 10; i++) {
                System.out.println("Producing: " + i);
                queue.put(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName()+" Interrupted.");
        }
    }
}
