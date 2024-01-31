package Formula1;
import java.util.Random;
public class Turbo {
	
	//CONSTRUCTOR
	private final int IDTURBO;
	private final int RPM;
	private final int TAMAÑO;
	private final 	Ingeniero INGENIERO;
	//CONSTRUCTOR
	public Turbo(int idTurbo, Ingeniero ingeniero) {
		super();
		Random aleatorio= new Random();
		this.IDTURBO = idTurbo;
		this.RPM =aleatorio.nextInt(10);
		this.TAMAÑO = aleatorio.nextInt(10);
		this.INGENIERO = ingeniero;
	}
	//GETTERS Y SETTERS
	public int getIdTurbo() {
		return IDTURBO;
	}
	public int getRpm() {
		return RPM;
	}
	public int getTamaño() {
		return TAMAÑO;
	}
	public Ingeniero getIngeniero() {
		return INGENIERO;
	}
}
