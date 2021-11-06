package practica;

public class Bicicleta extends Vehiculo {
	
	private int plato;
	private int piñon;
	public Bicicleta(int velocidad, String marca, int veloMax, int veloMin, int plato, int piñon) {
		super(velocidad, veloMax, veloMin, marca);
		this.plato = plato;
		this.piñon = piñon;
	}
	
	public Bicicleta() {}

	public int getPlato() {
		return plato;
	}

	public void setPlato(int plato) {
		this.plato = plato;
	}

	public int getPiñon() {
		return piñon;
	}

	public void setPiñon(int piñon) {
		this.piñon = piñon;
	}

	@Override
	public String toString() {
		return super.toString() + "Bicicleta [plato=" + plato + ", piñon=" + piñon + "]";
	}
	
	public void cambiarPlato() {
		plato += 1;
		System.out.println(plato);
	}
	
	
	

}
