import java.util.Scanner;
public class AreaTriangle{
	public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		System.out.println("Enter Base of Triangle in cm: ");
		double base = a.nextDouble();
		System.out.println("Enter Height of Triangle in cm: ");
		double height = a.nextDouble();
		double Area = 0.5 * base * height;
		// 1 inch = 2.54cm 
		double inch_b = base / 2.54; 
		double inch_h = height / 2.54;
		double Area_I = 0.5 * inch_b * inch_h;
		System.out.println("The Area of Triangle in sq inch is " + Area_I + " and sq cm is " + Area);
	}
}