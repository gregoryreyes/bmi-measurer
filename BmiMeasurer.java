import java.util.Scanner;
import java.text.DecimalFormat;

public class BmiMeasurer{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Input weight in lbs: ");
    double weight = sc.nextDouble();

    System.out.println("\nInput height: ");
    System.out.print("\nFeet: ");
    double feet = sc.nextDouble();
    System.out.print("\nInches: ");
    double inches = sc.nextDouble();
    
    sc.close();

    double height = (feet * 12) + inches;

    double BMI = (weight * 703) / (height * height);

    DecimalFormat df = new DecimalFormat("#.##");
    String formattedBMI = df.format(BMI);

    System.out.println("BMI is " + formattedBMI);

    String weightStatus;

    if ( BMI < 18.5 ) {
      weightStatus = "under weight.";
    } else if ( BMI >= 18.5 && BMI < 25 ) {
      weightStatus = "at a normal weight!";
    } else if ( BMI >= 25 && BMI < 30 ) {
      weightStatus = "overweight.";
    } else {
      weightStatus = "obese.";
    }

    System.out.println("Result: Your BMI is " + formattedBMI + ", which means you are " + weightStatus );

  }
}