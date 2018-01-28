
public class BowAndArrow implements iWeaponBehaviour {
	int wpnDamage = 20;
	
	@Override
	public String useWeapon() {
		// TODO Auto-generated method stub
		return "Bow and Arrow";
	}

	@Override
	public int getWeaponDamage() {
		// TODO Auto-generated method stub
		return wpnDamage;
	}
	
}
