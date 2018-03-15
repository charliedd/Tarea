
public abstract class PizzaStore {
	Pizza pizza;
	
	public Pizza orderPizza(String pizza){
		Pizza myPizza = createPizza(pizza);
		myPizza.hornear();
		myPizza.cortar();;
		return myPizza;
	}



	public abstract Pizza createPizza(String pizza);
		
}
