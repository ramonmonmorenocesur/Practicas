package Formula1;
import java.util.Random;
public class Chasis {
//ATRIBUTOS
	private final int IDCHASIS;
	private final int MATERIAL;
	private final Ingeniero INGENIERO;
	//CONSTRUCTOR
	public Chasis(int iDCHASIS,  Ingeniero iNGENIERO) {
		super();
		Random aleatorio = new Random();
		IDCHASIS = iDCHASIS;
		MATERIAL = aleatorio.nextInt(10);
		INGENIERO = iNGENIERO;
		
	}
	// GETTERS Y SETTERS
	public int getIDCHASIS() {
		return IDCHASIS;
	}
	public int getMATERIAL() {
		return MATERIAL;
	}
	public Ingeniero getINGENIERO() {
		return INGENIERO;
	}
	
}
