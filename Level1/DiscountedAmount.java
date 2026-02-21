public class DiscountedAmount{
	public static void main(String[] args){
		int fee = 125000;
		int discountPercent = 10;
		double discountPrice = ((double)discountPercent/100) * (double)fee;
		double discountFee = (double)fee -  discountPrice;
		System.out.println("The Discount Amount is INR " +discountPrice+ " and Final Discounted Fee is INR " +discountFee);
	}
}
