package com.udayan;

import java.util.concurrent.BlockingQueue;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;

public class HazelcasrServerDemosClient {
	
	public static void main(String[] args) {
		ClientConfig cf=new ClientConfig();
		cf.setInstanceName("MyCluster");
		HazelcastInstance hc = HazelcastClient.newHazelcastClient(cf);
		BlockingQueue<String> queue=hc.getQueue("queue");
		queue.add("Subha");
		queue.add("Veena");
		queue.add("Saba");
		hc.shutdown();
	}

}
