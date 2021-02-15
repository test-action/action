import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

	@Test
	public void testAdd() {
		int actual = Main.add(2,2);

		assertEquals(5, actual);
	}
}
