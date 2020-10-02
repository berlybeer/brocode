package JavaFinalAccessModifier;

public class Main {
	
	public static void main(String[] args) {
		final int boilingPoint = 100;//Celsius
		final int freezingPoint = 0;
		
		boilingPoint = boilingPoint + 1;
	}
	
	

}


//The final local variable boilingPoint cannot be assigned. It must be blank and not using a compound assignment
