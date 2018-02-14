
public interface IProvider {
	public void attach(User user);
	public void detach(User user);
	public void notifyUsers();
	public void addPackage(User user,String content);
}
