import java.util.Scanner;
public class CTC{
	public static void main(String[] args){
		Scanner CB = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name = CB.nextLine();
		System.out.println("Enter Starting City Name: ");
		String Scity = CB.nextLine();
		System.out.println("Enter Final Destination City Name: ");
		String Fcity = CB.nextLine();
		System.out.println("Enter Through Which City: ");
		String Vcity = CB.nextLine();
		System.out.println("Distance Between Starting City and Via City: ");
		double disStoV = CB.nextDouble();
		System.out.println("Distance Between Via City and Final City: ");
		double disVtoF = CB.nextDouble();
		System.out.println("Time Taken to Travel from Starting City to Via City (in minutes): ");
        double TimeStoV = CB.nextDouble();
		System.out.println("Time Taken to Travel from Via City to Final City (in minutes): ");
		double TimeVtoF = CB.nextDouble();
		double TotalDis = disStoV + disVtoF;
		double TotalTime = TimeStoV + TimeVtoF;
		System.out.println("The Total Distance travelled by " +name+ " from " +Scity+ " to " +Fcity+ " via " +Vcity+ " is " +TotalDis+ " km and the Total Time taken is " +TotalTime+ " minutes");
	}
}

