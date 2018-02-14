import java.util.List;

public class FirstUserType extends User {
	public FirstUserType(String name){
		super(name);
	}
	
	public void Update(List<Package> packageList){
		for (Package p : packageList){
			if (p.getUserInstance() == this){
				System.out.println("Usuario tipo 1 package id: " + p.getPackageID()+ 
								   " a nombre de: " + p.getUserInstance().name + 
								   " y el pagquete dice: " + p.getContent());
			}
		}
	}

}
