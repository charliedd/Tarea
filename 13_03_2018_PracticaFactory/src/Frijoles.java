
public class Frijoles extends Ingrediente {

	public Frijoles(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getdesc() {
		// TODO Auto-generated method stub
		return super.pizza.getdesc() + " con Frijoles";
	
	}
}
