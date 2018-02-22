
public class Crema extends Ingrediente {
	
	public Crema(Bebida bebida) {
		super(bebida);
	}

	@Override
	public String getDescription() {
		return "Soy crema";
	}

	@Override
	public double cost() {
		return super.bebida.cost() + 8 * super.bebida.getSize();
	}

}
