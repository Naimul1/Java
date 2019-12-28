package Lesson1;
public class WeightConverter
{
public static void main(String[] args)
{

	double weight;
	String weightUnit;
	double convert;
	
	System.out.println("What is your weight? ");
	weight = input().nextDouble(); 

	if (weight <= 0 || weight >500) {
		System.out.println ("Enter valid weight!");
	}
	else {
		System.out.println("If this is in Kg enter 'K' or 'L' for pound (lb) ");
		weightUnit = input().nextLine();
		
		if (weightUnit.toLowerCase().equals("k")) {
			convert = weight * 2.21;
			System.out.println("Your weight is " + weight + "kg and " convert + " lb");
		} else if (weightUnit.toLowerCase().equals("l")) {
			convert = weight / 2.21;
			System.out.println ("your weight is " + weight + "lb and " + convert + "kg");
		} else {
			System.out.println("Enter invalid unit");
		}
	}
}


//for (int i = 5; i < 7; i++)
//{ System.out.println(i);

	private static Scanner input() {
		return new Scanner(system.in);
	}
 }

