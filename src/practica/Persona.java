package practica;

public abstract class Persona implements Actor{
	
	//atributos
	
	private String Nombre;
	private String Apellido;
	private int edad;
	private int dni;
	
	
	public Persona(String nombre, String apellido, int edad, int dni) {
		super();
		Nombre = nombre;
		Apellido = apellido;
		this.edad = edad;
		this.dni = dni;
	}
	
	public Persona() {}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Persona [Nombre=" + Nombre + ", Apellido=" + Apellido + ", edad=" + edad + ", dni=" + dni + "]";
	}
	
	
	
	
	
}
