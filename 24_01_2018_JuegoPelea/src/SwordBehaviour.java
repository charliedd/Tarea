
public class SwordBehaviour implements iWeaponBehaviour {
	int wpnDamage = 40;
	@Override
	public String useWeapon() {
		// TODO Auto-generated method stub
		return "Sword";
	}

	@Override
	public int getWeaponDamage() {
		// TODO Auto-generated method stub
		return wpnDamage;
	}
	
}
