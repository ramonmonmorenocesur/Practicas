package Formula1;
import java.util.Random;
public class Neumaticos {
 //ATRIBUTOS
	private enum tipoDureza {Blando,Medio,Duro};
	private final int IDNEUMATICO;
	private final int MATERIAL;
	private final Ingeniero INGENIERO;
	private tipoDureza dureza;
	//CONSTRUCTOR
	public Neumaticos(int iDNEUMATICO, Ingeniero INGENIERO) {
		super();
		Random aleatorio = new Random();
		IDNEUMATICO = iDNEUMATICO;
		MATERIAL = aleatorio.nextInt(10);
		dureza=null;
		this.INGENIERO = INGENIERO;
	}
	//GETTERS Y SETTERS
	public tipoDureza getDureza() {
		return dureza;
	}
	public void setDureza(String dureza) {
		switch(dureza) {
		case "Blando":
			this.dureza=tipoDureza.Blando;
			break;
		case"Medio":
			this.dureza=tipoDureza.Medio;
			break;
		case"Duro":
			this.dureza=tipoDureza.Duro;
		}
		
	}
	public void setDureza(tipoDureza dureza) {
		this.dureza = dureza;
	}
	public int getIDNEUMATICO() {
		return IDNEUMATICO;
	}
	public int getMATERIAL() {
		return MATERIAL;
	}
	public Ingeniero getINGENIERO() {
		return INGENIERO;
	}
	
	
}
