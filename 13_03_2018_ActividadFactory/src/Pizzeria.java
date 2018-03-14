
public class Pizzeria {

	public static void main(String[] args) {
		PizzaStore pizzeriaP = new PizzaPlayas();
		System.out.println(pizzeriaP.orderPizza("A"));
		
		PizzaStore pizzeriaC = new PizzaCetys();
		System.out.println(pizzeriaC.orderPizza("B"));

	}

}
