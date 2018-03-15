
public class PizzaCetys extends PizzaStore {
	
	
	@Override
	public Pizza createPizza(String tipo) {
		
		
		
		switch(tipo){
		case "A":
			super.pizza = new HarinaIntegral();
			super.pizza.setSize("m");
			super.pizza = new Pepperoni(pizza);
			super.pizza = new Jamon(pizza);
			break;
		case "B":
			super.pizza = new HarinaIntegral();
			super.pizza.setSize("g");
			super.pizza = new Pepperoni(pizza);
			super.pizza = new Jamon(pizza);
			break;
		default:
			super.pizza = new HarinaIntegral();
			super.pizza.setSize("c");
			super.pizza = new Jamon(pizza);
			break;
		}
		
		pizza.addtoDesc(" hecha en Cetys ");
		
		return pizza;
	}

}
