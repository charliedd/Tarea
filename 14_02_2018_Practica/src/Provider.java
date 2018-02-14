import java.util.ArrayList;
import java.util.List;

public class Provider implements IProvider {
	
	List<User> userList;
	List<Package> packageList;
	String substring;
	int idCurrent;
	int secsForNotif; //Segundos que va a tardar para notificar
	int currentSecs;
	
	public Provider(String substring, int seconds){
		this.substring = substring;
		userList = new ArrayList<User>();
		packageList = new ArrayList<Package>();
		idCurrent = 0;
		this.secsForNotif = seconds;
		currentSecs = 0;
	}
	
	public void checkStatus(){
		if(currentSecs >= secsForNotif){
			notifyUsers();
			currentSecs = 0;
		}
		currentSecs++;
	}
	
	public void addPackage(User user, String content){
		Package newPackage = new Package(generateId(), user, content);
		packageList.add(newPackage);
	}
	
	@Override
	public void attach(User user) {
		if (userList.contains(user)){
			return;
		}else{
			userList.add(user);
		}
		
	}

	@Override
	public void detach(User user) {
		userList.remove(user);
	}

	private String generateId() {
		String id = Integer.toString(idCurrent++);
		return substring + id;
	}

	@Override
	public void notifyUsers() {
		for (User user : userList){
			user.Update(packageList);
		}
		
	}
	

}
