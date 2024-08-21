import java.util.Scanner;
public class IT24101613Lab5Q1 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the first integer: ");
		int no1=reader.nextInt();
		int smallest=no1;
		int largest=no1;
		System.out.print("Enter the second integer: ");
		int no2=reader.nextInt();
		System.out.print("Enter the third integer: ");
		int no3=reader.nextInt();
		if (no2<smallest) {
			smallest=no2;
		}
		if (no2>largest) {
			largest=no2;
		}
		if (no3<smallest) {
			smallest=no3;
		}
		if (no3>largest) {
			largest=no3;
		}
		System.out.println();
		System.out.println("User entered numbers are: "+no1+" "+ no2+ " "+no3);
		System.out.println("The Smallest number is: " +smallest );
		System.out.println("The Largest number is: " +largest );
	}
}	
		
		
			
		
