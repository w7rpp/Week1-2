import java.util.Scanner;
public class YardMile{
	public static void main(String[] args){
		Scanner Y = new Scanner(System.in);
		System.out.println("Enter Distance in Feet: ");
		double distanceInFeet = Y.nextDouble();
		// 1 Yard = 3 Feet and 1 Mile = 1760 Yards;
		double disYard = distanceInFeet / 3.00000;
		double disMile = disYard / 1760.0000;
		System.out.println("The Distance in Yards is " +disYard+ " while the Distance in Miles is " +disMile);
	}
}
