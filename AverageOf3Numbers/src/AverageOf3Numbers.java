import java.util.Scanner;

public class AverageOf3Numbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Enter Three numbers ");
		
		Double Number1 = scan.nextDouble() ;
		Double Number2 = scan.nextDouble();
		Double Number3 = scan.nextDouble();

		Double average = ( Number1 + Number2 + Number3 )/3;
		
		System.out.println("The average for three number which are " + Number1 +" , " + Number2 + " , " + Number3 + " " +" will be " + average);
		

	}

}