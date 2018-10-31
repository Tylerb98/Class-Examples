import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class MaxTest {

	@Test
	public void test() {
		ArrayList<Integer> myInts = new ArrayList<Integer>();
		myInts.add(10);
		myInts.add(12);
		myInts.add(2);
		myInts.add(5);
		myInts.add(-30);
		
		assertEquals(new Integer(23), Max.getMax(myInts));
	}

}
