package practica;

public class Coche extends Vehiculo {
	
	private String motor;
	private boolean patente;

	public Coche(int velocidad,int veloMax, int veloMin, String marca, String motor, boolean patente) {
		super(velocidad, veloMax, veloMin, marca);
		this.motor = motor;
		this.patente = patente;
	}
	public Coche() {}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}
	
	public boolean isPatente() {
		return patente;
	}

	public void setPatente(boolean patente) {
		this.patente = patente;
	}

	@Override
	public String toString() {
		return super.toString() + "Coche [motor=" + motor + ", patente=" + patente + "]";
	}
	
	public void remolcado() {
		if (patente == true) 
			System.out.println("Continue con su viaje");
		else {
			System.out.println("Remolcado");
			super.sinVida();
		}
	}

	

}
