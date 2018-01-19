/**
 * 
 */
package printrange;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * @author aditya1
 *
 */
public class CheckRange {


	@Test
	public void testAllNumbersInRange(){
		List<Integer> list1 = Arrays.asList(2,4,6,8);
		Range ob1 = new FindRange();
		assertEquals(list1, ob1.printAllNumbersInRange(1,10));
		}
}