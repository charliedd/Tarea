
public class Client {
	public static void main(String[] args){
		Invoker invoker = new Invoker();
		System.out.println(invoker.ButtonPress(2));
		System.out.println(invoker.ButtonPress(4));
		System.out.println(invoker.buttonUndo());
	}
}
