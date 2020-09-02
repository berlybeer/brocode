package codeBro;
import java.util.Scanner;
public class javaMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 3.14;
		double y = -10;
		
		double z = Math.max(x,y);
		
		double a = Math.min(x, y);
		double b = Math.min(-10, 3.14);
		double c = Math.abs(y);
		double d = Math.sqrt(81);
		
		double e = Math.round(3.99);
		double f = Math.ceil(3.99);
		double g = Math.floor(3.99);
		
		
		System.out.println(z);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		
		
		double cat1;
		double cat2;
		double hipo;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter length of side a: ");
		cat1 = scan.nextDouble();
		
		System.out.println("Please enter length of side b: ");
		cat2 = scan.nextDouble();
		
		hipo = Math.sqrt((a*a)+(b*b));
		System.out.println("The hypotenuse is: " + Math.floor(hipo));
		System.out.println("The hypotenuyse with no round is: " + hipo);
		
	}

}
