
public class AxeBehaviour implements iWeaponBehaviour{
	int wpnDamage = 30;
	
	@Override
	public String useWeapon() {
		// TODO Auto-generated method stub
		return "Axe";
	}

	@Override
	public int getWeaponDamage() {
		// TODO Auto-generated method stub
		return wpnDamage;
	}
	
}
