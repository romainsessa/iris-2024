package fr.iris.maven.character;

import fr.iris.maven.exception.InvalidCharacterException;

public abstract class GameCharacter {
	
	protected static int MAX_LIFE = 1000;
	protected static int MIN_LIFE = 0;	
	
	private String name;
	private int life;
	
	public GameCharacter() {
		this.name = "undefined";
		this.life = GameCharacter.MAX_LIFE;
	}
	
	public GameCharacter(
			String name,
			int life) throws InvalidCharacterException {
		this.name = name;
		
		if(life < 0) {
			throw new InvalidCharacterException();
		}
		
		this.life = life;
	}
	
	public int getLifePoint() {
		return life;
	}
	
	public void setLifePoint(int life) {
		this.life = life;
	}

	@Override
	public String toString() {
		return "name=" + name + 
				", life=" + life;
	}
	
}
