package lvl1_Ex2;

public class CalculoDni {
	private int numDni;
	private final String caracteres;
	
	public CalculoDni(int numDni) {
		this.numDni=numDni;
		caracteres="TRWAGMYFPDXBNJZSQVHLCKE";
	}

	public int getNumDni() {
		return numDni;
	}

	public void setNumDni(int numDni) {
		this.numDni = numDni;
	}

	public char calcularLetra() {
		int resto = numDni % 23;
		return caracteres.charAt(resto);
	}
}
