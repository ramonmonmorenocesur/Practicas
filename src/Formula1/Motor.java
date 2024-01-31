package Formula1;

public class Motor {
	
	
	//ATRIBUTOS
	private final int IDMOTOR;
	private final Cilindro CILINDRO;
	private final Turbo TURBO;
	private final Ingeniero INGENIERO;
	//CONSTRUCTOR
	public Motor(int iDMOTOR, Cilindro cILINDRO, Turbo tURBO, Ingeniero iNGENIERO) {
		super();
		IDMOTOR = iDMOTOR;
		CILINDRO = cILINDRO;
		TURBO = tURBO;
		INGENIERO = iNGENIERO;
	}
	//GETTERS Y SETTERS
	public int getIDMOTOR() {
		return IDMOTOR;
	}
	public Cilindro getCILINDRO() {
		return CILINDRO;
	}
	public Turbo getTURBO() {
		return TURBO;
	}
	public Ingeniero getINGENIERO() {
		return INGENIERO;
	}
	
}
