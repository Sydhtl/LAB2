import java.util.Scanner;

public class SalePrice {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("State the original price of the product ");
		 
		Double originalPrice = input.nextDouble() ;
		
		System.out.println("State the percentage discount for the product in percent ");
		
		Double percentageDiscount = input.nextDouble();
		
		Double salePrice = (originalPrice -(originalPrice *( percentageDiscount/100))) ;
		
		System.out.println("The sale price in RM for the product that has original price RM " + originalPrice + " with percentage discount " + percentageDiscount + " percent is RM " + salePrice );
		
		
		
	}
}
