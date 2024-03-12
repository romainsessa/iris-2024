package character;

import exception.InvalidCharacterException;

public class Fighter 
	extends GameCharacter implements IFighter {

	private int attackPower;
	
	public int getAttackPower() {
		return attackPower;
	}
	
	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	
	public Fighter(
			String name,
			int lifePoint,
			int attackPower) throws InvalidCharacterException {
		super(name, lifePoint);
		this.attackPower = attackPower;
	}
	
	public void attack(GameCharacter character) {
		int currentLifePoint = 
				character.getLifePoint();
		int newLifePoint = 
				currentLifePoint - attackPower;
		if(newLifePoint < GameCharacter.MIN_LIFE) {
			newLifePoint = GameCharacter.MIN_LIFE;
		}
		character.setLifePoint(newLifePoint);
	}

	@Override
	public String toString() {
		return "Fighter ["
				+ super.toString()
				+ ", attackPower=" 
				+ attackPower + "]";
	}
	
	
	
}