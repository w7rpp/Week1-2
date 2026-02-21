public class PLCalc{
	public static void main(String[] args){
		int cPrice = 129;
		int sPrice = 191;
		int Profit = sPrice - cPrice;
		double ProfitPercent = (Profit / (double) cPrice)*100;
		System.out.println("The Cost Price in INR " +cPrice+ " and Selling Price is INR " +sPrice+"\n"+ "The Profit is INR " +Profit+ " and the Profit Percentage is " +ProfitPercent+ "%");
	}
}
