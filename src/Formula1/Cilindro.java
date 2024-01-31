package Formula1;
import java.util.Random;
public class Cilindro {
	//ATRIBUTOS
	private final int IDCILINDRO;
	private final int CAPACIDAD;
	private final int MATERIAL;
	private final Ingeniero INGENIERO;
	public Cilindro(int idCilindro,  Ingeniero ingeniero) {
		super();
		Random aleatorio= new Random();
		this.IDCILINDRO = idCilindro;
		this.CAPACIDAD = aleatorio.nextInt(10);
		this.MATERIAL =aleatorio.nextInt(10);
		this.INGENIERO = ingeniero;
	}
	public int getIdCilindro() {
		return IDCILINDRO;
	}
	public int getCapacidad() {
		return CAPACIDAD;
	}
	public int getMaterial() {
		return MATERIAL;
	}
	public Ingeniero getIngeniero() {
		return INGENIERO;
	}
	
	

}
