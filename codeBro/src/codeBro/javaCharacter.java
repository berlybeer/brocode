package codeBro;

public class javaCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//primitive			//wrapper class
		//-----------		---------------
		//char				//Character
		
		char letter = '1';
		
		System.out.println(Character.isDigit(letter));

		char letter2 = 'A';
		System.out.println(Character.isUpperCase(letter2));
		
		char letter3 = 'a';
		System.out.println(Character.isLowerCase(letter3));
		
		char letter4 = '/';
		System.out.println(Character.isLetterOrDigit(letter4));
	
		char letter5 = ' ';
		System.out.println(Character.isWhitespace(letter5));
		
		char letter6 = 'b';
		System.out.println(Character.toUpperCase(letter6));
		
		char letter7 = 'B';
		System.out.println(Character.toLowerCase(letter7));
		
		char newLetter = Character.toLowerCase(letter7);
		System.out.println(newLetter);
		
		boolean otherLetter = Character.isWhitespace(newLetter);
		System.out.println(otherLetter);
		
		
	
		
		
		
		
	}

}
