
public class Client {
	public static void main(String[] args){
		Receiver luces = new Luces();
		Command prenderLuces = new TurnOnLights(luces);
		Invoker invoker = new Invoker(prenderLuces);
		System.out.println(invoker.ButtonPress());
	}
}
