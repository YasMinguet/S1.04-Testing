package lvl1_Ex2;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class) 
public class CalculoDniTest {
	
	@Parameters
	public static List<Integer> getData(){
		List<Integer>obj=new ArrayList<>();
		obj.add(47720586);
		obj.add(48750366);
		obj.add(38542495);
		obj.add(15023698);
		obj.add(78259678);
		obj.add(42586368);
		obj.add(25423685);
		obj.add(74125369);
		obj.add(02541636);
		obj.add(25468231);
		return obj;
	}
	
	private int numDni;
	private final String caracteres;
	
	public CalculoDniTest(int numDni) {
		this.numDni=numDni;
		caracteres="TRWAGMYFPDXBNJZSQVHLCKE";
		
	}

	@Test
	public void testCalculoLetra() {;
		CalculoDni calc=new CalculoDni(numDni);
		char resultado=calc.calcularLetra();
		char exp=caracteres.charAt(numDni%23);
		assertEquals(exp,resultado);
		
		
	}

}
