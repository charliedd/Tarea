package ejercicioMovimiento;

public abstract class Persona {
	private String nombre;
	private boolean genero; 
	private int edad;
	private iMovimiento movi;
	
	public Persona(String nombre,boolean genero, int edad, iMovimiento movi){
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
		this.movi = movi;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean esMen() {
		return genero;
	}
	public void setGenero(boolean genero) {
		this.genero = genero;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public iMovimiento getMovi() {
		return movi;
	}

	public void setMovi(iMovimiento movi) {
		this.movi = movi;
	}
	
	public String toString(){
		return "Mi nombre es " + nombre + " tengo " + edad + " años y " + movi.muevete();
	}
	
	public String muevete(){
		return this.movi.muevete();
	}
	
	public String salta(){
		return this.movi.salta();
	}
}
