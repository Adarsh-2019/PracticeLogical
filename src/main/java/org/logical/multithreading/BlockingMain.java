package org.logical.multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingMain {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5); // Queue size of 5

        BlockingProducer producer = new BlockingProducer(queue);
        BlockingConsumer consumer = new BlockingConsumer(queue);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
    }
}
