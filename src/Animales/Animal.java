package Animales;

public class Animal {

	public Animal(String nombre, int tpVida) {
		super();
		if (tpVida > 0 && tpVida < 150) {
			this.nombre = nombre;
			this.tpVida = tpVida;
		} else {
			this.tpVida=0;
		}
	}

	private String nombre;
	private int tpVida;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTpVida() {
		return tpVida;
	}

	public void setTpVida(int tpVida) {
		this.tpVida = tpVida;
	}
}
