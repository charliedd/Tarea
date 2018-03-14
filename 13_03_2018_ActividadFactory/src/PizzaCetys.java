
public class PizzaCetys extends PizzaStore {
	Pizza pizza;
	
	
	
	@Override
	public Pizza createPizza(String tipo) {
		
		
		
		switch(tipo){
		case "A":
			pizza = new PizzaA();
			break;
		case "B":
			pizza = new PizzaB();
			break;
		default:
			pizza = new PizzaC();
			break;
		}
		
		pizza.addtoDesc(" hecha en Cetys ");
		
		return pizza;
	}

}
