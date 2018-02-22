
public abstract class Bebida {

	String descripcion;
	String size;
	
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getSize() {
		if (size == "s")return .75;
		else if (size == "m")return 1;
		else return 1.25;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public abstract double cost();
	

	
}
