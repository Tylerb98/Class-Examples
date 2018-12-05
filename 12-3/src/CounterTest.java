import static org.junit.Assert.*;

import org.junit.Test;

public class CounterTest {

	@Test
	public void test() {
		Counter c = new Counter();
		assertEquals(0, c.value());
		for (int i =0; i<30000; i++){
			c.increment();
		}
		assertEquals(30000,c.value());
	}

}
