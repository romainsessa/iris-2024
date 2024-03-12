package character;

public class Healer 
	extends GameCharacter implements IHealer {
	
	private int healPower;
	
	public int getHealPower() {
		return healPower;
	}
	
	public void setHealPower(int healPower) {
		this.healPower = healPower;
	}
	
	public Healer(
			String name, 
			int lifePoint, 
			int healPower) {
		super(name, lifePoint);
		this.healPower = healPower;
	}
	
	public void heal(GameCharacter character) {
		int currentLifePoint = 
				character.getLifePoint();
		int newLifePoint = 
				currentLifePoint + healPower;
		if(newLifePoint > GameCharacter.MAX_LIFE) {
			newLifePoint = GameCharacter.MAX_LIFE;
		}		
		character.setLifePoint(newLifePoint);		
	}
	
	public void autoHeal() {
		this.heal(this);
	}

	@Override
	public String toString() {
		return "Healer [" 
				+ super.toString() 
				+ ", healPower=" 
				+ healPower + "]";
	}

}