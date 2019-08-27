package com.udayan;

import java.util.Map;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

public class BackupDemo {
	
	public static void main(String[] args) {
		HazelcastInstance member1 = Hazelcast.newHazelcastInstance();
		HazelcastInstance member2 = Hazelcast.newHazelcastInstance();
		
		Map<String, String> employees = member1.getMap("employees");
		 if(employees.containsKey("1"))
		    {
			    employees.put("6", "emp6");
		
		    }else
	    employees.put("1", "emp1");
	    employees.put("2", "emp2");
	    employees.put("3", "emp3");
	    employees.put("4", "emp4");
	    employees.put("5", "emp5");
	    
	    System.out.println("No of instances ="+Hazelcast.getAllHazelcastInstances().size());
	    System.out.println(" getting from member 2 ="+member2.getMap("employees").size());
	    
	    employees.remove("3");
	    System.out.println("after removing frm map  getting from member 2 ="+member2.getMap("employees").size());
	    member1.shutdown();
	    System.out.println("No of instances after shut="+Hazelcast.getAllHazelcastInstances().size());
	       
	}

}
