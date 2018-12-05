
public class RaceCondition extends Thread{
	private Counter counter;
	
	public RaceCondition(Counter c){
		this.counter = c;
	}
	
	@Override
	public void run(){
		this.counter.increment();
	}
	
	public static void main(String[] args){
		Counter commonCounter = new Counter();
		
		Thread[] threads = new Thread[30000];
		
		for (int i = 0; i < threads.length; i++){
			threads[i] = new RaceCondition(commonCounter);
			threads[i].start();
		}
		
		System.out.println("Final count: " + commonCounter.value());
	}
}
