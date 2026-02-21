public class VolEarth{
	public static void main(String[] args){
		int rEarth = 6378;
		double KM_Mile = 1.6;
		//from previous question, given conversion value is  1km = 1.6miles, whereas actual conversion is 1km = 0.6 miles
		double pi = 3.14159;
		double KM_op = (double)rEarth * KM_Mile;
		double Volume = (4.0/3.0) * pi * (rEarth * rEarth * rEarth);
		double Volume_M = (4.0/3.0) * pi * (KM_op * KM_op * KM_op);
		System.out.println("The Volume of Earth in Cubic Kilometers is " +Volume+ " and in Cubic Miles is " +Volume_M);
	}
}
