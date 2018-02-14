import java.util.List;

public abstract class User {
	String name;
	
	public User(String name){
		this.name = name;
	}
	
	public void registerPackage(IProvider provider, String content){
		provider.attach(this);
		provider.addPackage(this, content);
	}
	
	public void Update(List<Package> packageList){
		for (Package p : packageList){
			if (p.getUserInstance() == this){
				System.out.println("El id del paquete es " + p.getPackageID());
			}
		}
	}
	
}
