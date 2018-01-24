package ejercicioMovimiento;

public class Cocinero extends Persona {
	private String puesto;
	
	public String getPuesto() {
		return this.puesto;
	}

	public void setpuesto(String puesto) {
		this.puesto = puesto;
	}

	public Cocinero(String nombre, boolean genero, int edad, iMovimiento movi, String puesto ){
		super(nombre,genero,edad,movi);
		this.puesto = puesto;
	}
}
