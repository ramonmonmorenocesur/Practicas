
package Formula1;

public class Coche {

	//ATRIBUTOS
	private final String modelo;
	private final Chasis CHASIS;
	private final Neumaticos NEUMATICOS;
	private final Motor MOTOR;
	private final Ingeniero INGENIERO;
	//CONSTRUCTOR
	public Coche(String modelo, Chasis cHASIS, Neumaticos nEUMATICOS, Motor mOTOR, Ingeniero iNGENIERO) {
		super();
		this.modelo = modelo;
		CHASIS = cHASIS;
		NEUMATICOS = nEUMATICOS;
		MOTOR = mOTOR;
		INGENIERO = iNGENIERO;
	}
	//GETTERS Y SETTERS
	public String getModelo() {
		return modelo;
	}
	public Chasis getCHASIS() {
		return CHASIS;
	}
	public Neumaticos getNEUMATICOS() {
		return NEUMATICOS;
	}
	public Motor getMOTOR() {
		return MOTOR;
	}
	public Ingeniero getINGENIERO() {
		return INGENIERO;
	}
}
