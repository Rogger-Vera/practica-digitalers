package practica;

public class Bicicleta extends Vehiculo {
	
	private int plato;
	private int pi�on;
	public Bicicleta(int velocidad, String marca, int veloMax, int veloMin, int plato, int pi�on) {
		super(velocidad, veloMax, veloMin, marca);
		this.plato = plato;
		this.pi�on = pi�on;
	}
	
	public Bicicleta() {}

	public int getPlato() {
		return plato;
	}

	public void setPlato(int plato) {
		this.plato = plato;
	}

	public int getPi�on() {
		return pi�on;
	}

	public void setPi�on(int pi�on) {
		this.pi�on = pi�on;
	}

	@Override
	public String toString() {
		return super.toString() + "Bicicleta [plato=" + plato + ", pi�on=" + pi�on + "]";
	}
	
	public void cambiarPlato() {
		plato += 1;
		System.out.println(plato);
	}
	
	
	

}
