import java.util.Scanner;

public class WeightOfParcel {
	public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	
	System.out.println("State the weight parcel in pounds");
	
	Double weightInPounds = scan.nextDouble ();
	
	Double weightInKg = weightInPounds * 0.453592 ;
	
	System.out.println(" The weight parcel in pounds is " + weightInPounds + " and the parcel in kg is " + weightInKg );
	
	}
}