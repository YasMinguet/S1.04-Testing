package lvl1_Ex3;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {
	
	@Test (expected = IndexOutOfBoundsException.class)
	public void testMain(){
		int []array=new int[3];
		array[0]=50;
		array[1]=15;
		array[2]=-3;
		array[3]=8;
		
	}

}
