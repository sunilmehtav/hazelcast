package com.udayan;

import java.util.concurrent.BlockingQueue;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

public class HazelcastServerDemo {
	public static void main(String[] args) throws InterruptedException {
		HazelcastInstance hc = Hazelcast.newHazelcastInstance();
		BlockingQueue<String> queue=hc.getQueue("queue");
		for(;;) {
			System.out.println(queue.take());
		}
	}
}
