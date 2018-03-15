
public class PizzaPlayas extends PizzaStore {
	
	@Override
	public Pizza createPizza(String tipo) {
		
		switch(tipo){
		case "A":
			super.pizza = new Harina();
			super.pizza.setSize("m");
			super.pizza = new Pepperoni(pizza);
			super.pizza = new Jamon(pizza);
			super.pizza = new Frijoles(pizza);
			break;
		case "B":
			super.pizza = new Harina();
			super.pizza.setSize("g");
			super.pizza = new Pepperoni(pizza);
			super.pizza = new Jamon(pizza);
			break;
		default:
			super.pizza = new Harina();
			super.pizza.setSize("c");
			super.pizza = new Jamon(pizza);
			
			break;
		}
		
		pizza.addtoDesc(" hecha en playas ");
		
		return pizza;
	}

}
