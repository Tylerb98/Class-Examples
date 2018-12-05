
public class Counter {
	private int value = 0;
	
	public int value(){
		return this.value;
		}
	public synchronized void increment(){
		int temp;
		temp = this.value;
		temp++;
		this.value = temp;
	}
}
