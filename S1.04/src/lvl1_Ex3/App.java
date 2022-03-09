package lvl1_Ex3;

public class App {

	public static void main(String[] args) {
		try {
			int []array=new int[3];
			array[0]=50;
			array[1]=15;
			array[2]=-3;
			array[3]=8;
		
			for (int i=0;i<3;i++) {
				System.out.println("Posición "+i+" = "+array[i]);
			}
			
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.err.println("Error: "+ex.getMessage());
		}
		

	}

}
