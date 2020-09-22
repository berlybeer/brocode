package methods;

public class Main {

	public static void main(String[] args) {
		singASong();
		add(5,6);
		add(6,7);
		add(7,8);
		add(8,9);
		add(9,10);
		
		int a = addreturn(500,500);
		int b = addreturn(600, 600);
		
		display(a);
		display(b);
		
		
	}
	
	public static void singASong() {
		
		System.out.println("Spooky scary skeletons\r\n" +
				"Send shivers down your spine\r\n" +
				"Shrieking skulls will shock your soul\r\n"+
				"Seal your doom tonight\r\n" +
				"Spooky scary skeletons\r\n" +
				"Speak with such a screech\r\n" +
				"You'll shake and shudder in surprise\r\n" +
				"When you hear these zombies shriek\r\n" +
				"We're so sorry skeletons\r\n" +
				"You're so misunderstood\r\n" +
				"You only want to socialize\r\n" +
				"But I don't think we should\r\n" +
				"Couse spooky scary skeletons\r\n" +
				"Shout startling shrilly screams\r\n" +
				"They'll sneak from their sarcophagus\r\n" +
				"And just won't leave you be");
	}
	
	
	public static void add(int x, int y) {
		
		System.out.println(x+y);
	}
	
	public static int addreturn(int x, int y) {
		
		int z = x+y;
		return z;
	}
	
	public static void display(int x) {
		System.out.println(x);
	}

}
