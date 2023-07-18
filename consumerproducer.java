package Javalab;
import java.util.LinkedList;

public class Csmprd {

	public static void main(String[] args) throws InterruptedException {
		final PC pc=new PC();
		Thread t1= new Thread(new Runnable() {
			
		
			public void run() {
			  try {
	 		      pc.produce();			
	     	   }  
	           catch (InterruptedException e)
		         {
		             e.printStackTrace();
		         }
				
	}

  });
		//creating consumer thread
		Thread t2= new Thread(new Runnable() {
			
			
			public void run() {
			  try {
	 		      pc.consume();			
	     	   }  
	           catch (InterruptedException e)
		         {
		             e.printStackTrace();
		         }
				
	}

  });
		
		//start both threads
		t1.start();
		t2.start();
		
		//t1 finish before t2
		t1.join();
		t2.join();
		
 }
	
	
	 //pc class has list, producer, consumer
	public static class PC{
		LinkedList<Integer>list= new LinkedList<>();
		int capacity=2;
		
		public void produce() throws InterruptedException
		{
			int value= 0;
			while(true) {
				synchronized(this)
				{
					while(list.size()==capacity)
						wait();
					System.out.println("producerproduced-"+value);
					list.add(value++);
					notify();
					Thread.sleep(1000);
				}
			}
			
		}
		
		public void consume() throws InterruptedException
		{
			
			while(true) {
				synchronized(this)
				{
					while(list.size()==0)
						wait();
					int val=list.removeFirst();
					System.out.println("consumerconsumed-"+val);
					
					notify();
					Thread.sleep(1000);
				}
			}
			
		}
	}

}
