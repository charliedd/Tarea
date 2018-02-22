
public class Azucar extends Ingrediente{
	
	public Azucar(Bebida bebida) {
		super(bebida);
	}

	@Override
	public String getDescription() {
		return "Soy azucar";
	}

	@Override
	public double cost() {
		return super.bebida.cost() + 9 * super.bebida.getSize();
	}
}
