
public class KnifeBehaviour implements iWeaponBehaviour{
	int wpnDamage = 25;
	
	@Override
	public String useWeapon() {
		// TODO Auto-generated method stub
		return "Knife";
	}

	@Override
	public int getWeaponDamage() {
		// TODO Auto-generated method stub
		return wpnDamage;
	}
	
}
