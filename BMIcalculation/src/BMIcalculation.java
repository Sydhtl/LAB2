import java.util.Scanner;

public class BMIcalculation {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("State the weight in kg");
		 
		  Double weightInKg = input.nextDouble() ;
		  
		  System.out.println("State the height in m ");
		  
		
		  Double heightInM = input.nextDouble();
		  
		  Double BMI= weightInKg / ( heightInM * heightInM );
		  
		 System.out.println("The individual Body Mass Index with weight " + weightInKg + "kg and height " + heightInM +"m is " + BMI);
		 
		  
		  
		  
		  
		 
		 

	}

}