import java.util.concurrent.*; 

public	class ConcurrentQueue { 
	
	public static void main(String args[]) {
		BlockingQueue<String> queue = new ArrayBlockingQueue<>(2);
		queue.add("DEVA");
		queue.add("Ram");
		queue.add("HEllo");
		System.out.println(queue);
		
	}
}

