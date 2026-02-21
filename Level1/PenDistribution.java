public class PenDistribution{
	public static void main(String[] args){
		int No_Student = 3;
		int No_Pens = 14;
		int Pen_Student = No_Pens / No_Student;
		int Pen_Remaining = No_Pens % No_Student;
		System.out.println("The Pen Per Student is " +Pen_Student+ " and the remaining pen not distributed is " +Pen_Remaining);
	}
}
