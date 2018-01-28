
public interface iCharacter {
	public String fight(iCharacter target);
	public void iSetWeaponBehaviour(iWeaponBehaviour weapon);
	public String receivAttack(int damage);
	public String getName();
}
