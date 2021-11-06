package practica;

public class Estudiante extends Persona{
	
	String nivel;
	String curso;
	int nota;
	
	public Estudiante(String nombre, String apellido, int edad, int dni, String nivel, String curso, int nota) {
		super(nombre, apellido, edad, dni);
		this.nivel = nivel;
		this.curso = curso;
		this.nota = nota;
	}
	
	public Estudiante() {}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getnota() {
		return nota;
	}

	public void setnota(int nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return super.toString() + "Estudiante [nivel=" + nivel + ", curso=" + curso + ", nota=" + nota + "]";
	}
	
	public void informarMaterias() {
		
		if((nivel.toUpperCase()).equals("PRIMARIO") ) {
			System.out.println("Lista de materias de nivel " + nivel + ": " + 
					"\n\tLengua \n\tMatematica \n\tIngles \n\tEd Fisica");
		}else if((nivel.toUpperCase()).equals("SECUNDARIO")) {
			System.out.println("Lista de materias de nivel " + nivel + ": " + 
					"\n\tLengua \n\tMatematica \n\tBiologia \n\tGeografia \n\tIngles \n\tEd Fisica");
		}else
			System.out.println("Nivel incorrecto");
	}
	
	

}
