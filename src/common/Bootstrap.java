package common;

import character.GameCharacter;
import character.Cheater;
import character.Healer;
import character.Fighter;
import character.IFighter;
import character.IHealer;

public class Bootstrap {
	
	
	public static void main(String[] args) {
		
		GameCharacter fighter1 = new Fighter("superman", 100, 100);
		
		System.out.println(fighter1);
		
		IHealer healer1 = new Healer("test", 100, 1000);
		healer1.heal(fighter1);		
		((Healer) healer1).autoHeal();
		
		System.out.println(healer1);		
		System.out.println(fighter1);
		
		Cheater cheater1 = new Cheater("1");
		cheater1.attack(fighter1);
		
		System.out.println(cheater1);		
		System.out.println(fighter1);
		
	}

}
