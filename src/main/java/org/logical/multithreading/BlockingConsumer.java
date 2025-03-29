package org.logical.multithreading;

import java.util.concurrent.BlockingQueue;

public class BlockingConsumer implements Runnable {
    private final BlockingQueue<Integer> queue;

    public BlockingConsumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            while (true) {
                int value = queue.take();
                System.out.println("Consumed: " + value);
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName()+" Interrupted.");
        }
    }
}
