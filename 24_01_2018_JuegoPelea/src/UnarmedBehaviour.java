
public class UnarmedBehaviour implements iWeaponBehaviour{
	int wpnDamage = 10;
	
	@Override
	public String useWeapon() {
		// TODO Auto-generated method stub
		return "hands";
	}

	@Override
	public int getWeaponDamage() {
		// TODO Auto-generated method stub
		return wpnDamage;
	}
}
