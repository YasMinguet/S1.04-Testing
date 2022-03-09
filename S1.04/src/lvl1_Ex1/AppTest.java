package lvl1_Ex1;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class AppTest {
	ArrayList<String>list;
	@Before
	public void before() {
	list=new ArrayList<String>();
	}
	
	@Test
	public void testElements() {
		list.add("Enero");
		list.add("Febrero");
		list.add("Marzo");
		list.add("Abril");
		list.add("Mayo");
		list.add("Junio");
		list.add("Julio");
		list.add("Agosto");
		list.add("Septiembre");
		list.add("Octubre");
		list.add("Noviembre");
		list.add("Diciembre");
		assertEquals(12,list.size());
		assertEquals("Agosto",list.get(7));
		assertFalse(list.isEmpty());
		assertFalse(list.size() == 0);
	}

}

