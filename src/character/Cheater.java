package character;

public class Cheater extends GameCharacter 
		implements IFighter, IHealer {

	public Cheater(String name) {
		super(name, 10000);
	}

	@Override
	public void heal(GameCharacter character) {
		character.setLifePoint(GameCharacter.MAX_LIFE);		
	}

	@Override
	public void attack(GameCharacter character) {
		character.setLifePoint(GameCharacter.MIN_LIFE);		
	}
	
	@Override
	public String toString() {
		return "Cheater [" 
				+ super.toString()  
				+ "]";
	}
	
}
