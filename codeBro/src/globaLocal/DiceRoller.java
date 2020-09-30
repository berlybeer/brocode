package globaLocal;

import java.util.Random;

public class DiceRoller {
	
		Random random;
		int dice;

		DiceRoller(){
			random = new Random();
			dice = 0;
			rollADice();	
		}
		
		void rollADice() {
			dice = random.nextInt(6)+1;
			System.out.println("You rolled a: " + dice);
		}
}
