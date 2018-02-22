
public abstract class Ingrediente extends Bebida {
	Bebida bebida;
	
	public Ingrediente(Bebida bebida){
		this.bebida = bebida;
	}
	

	public abstract String getDescription();
	
	public double getSize(){
		return super.getSize();
	}
}
