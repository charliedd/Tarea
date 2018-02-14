
public class Package {
	
	private String packageID;
	private User userInstance;
	private String content;
	private String status;
	
	public Package(String packageID, User userInstance, String content){
		this.packageID = packageID;
		this.userInstance = userInstance;
		this.content = content;
		this.status = "En almacen";
	}
	
	public User getUserInstance() {
		return userInstance;
	}
	public void setUserInstance(User userInstance) {
		this.userInstance = userInstance;
	}
	public String getPackageID() {
		return packageID;
	}
	
	public String getContent(){
		return content;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


}
