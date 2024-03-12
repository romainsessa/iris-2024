package character;

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
			int life) {
		this.name = name;
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
