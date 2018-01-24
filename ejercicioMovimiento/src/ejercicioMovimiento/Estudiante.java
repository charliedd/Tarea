package ejercicioMovimiento;

public class Estudiante extends Persona{
	private int matricula;
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Estudiante(String nombre, boolean genero, int edad, iMovimiento movi, int matricula ){
		super(nombre,genero,edad,movi);
		this.matricula = matricula;
	}
}
