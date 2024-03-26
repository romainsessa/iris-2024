package fr.iris.maven.common;

import fr.iris.maven.character.Cheater;
import fr.iris.maven.character.Fighter;
import fr.iris.maven.character.GameCharacter;
import fr.iris.maven.character.Healer;
import fr.iris.maven.character.IFighter;
import fr.iris.maven.character.IHealer;
import fr.iris.maven.exception.InvalidCharacterException;

public class Bootstrap {
	
	
	public static void main(String[] args) {
		
		GameCharacter fighter1;
		
		try {
			fighter1 = new Fighter("superman", 100, 100);
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
			
		} catch (InvalidCharacterException e) {
			System.out.println("Log : les informations saisies sont erronées");
		}
		
		
		
	}

}
