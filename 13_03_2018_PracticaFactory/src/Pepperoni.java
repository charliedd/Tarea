
public class Pepperoni extends Ingrediente {

	public Pepperoni(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getdesc() {
		// TODO Auto-generated method stub
		return super.pizza.getdesc() + "con Pepperoni";
	}

}
