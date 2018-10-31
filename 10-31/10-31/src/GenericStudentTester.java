import static org.junit.Assert.*;

import org.junit.Test;

public class GenericStudentTester {

	@Test
	public void test() {
		int foo = 87;
		GenericStudent<Integer> score = new GenericStudent<Integer>(foo);
		assertEquals("This student has an 8.7", score.getGrade());
		
		GenericStudent<Character> letterGrade = new
	}

}
