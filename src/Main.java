import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double weight, height, BMI, weightKg, heightMetars, IdMen, IdWomen;

        int gender;

        Scanner sc = new Scanner(System.in);

        System.out.println("Calculate your body mass index!");

        System.out.println("Your Height in inches : ");
        height = sc.nextDouble();

        heightMetars = height * 0.0254;

        System.out.println("Your Weight in pounds : ");
        weight = sc.nextDouble();

        weightKg = 0.45359237 * weight;

        BMI = (weightKg / Math.pow(heightMetars, 2));

        System.out.println("Your gender 1 for men or 2 for women: ");
        gender = sc.nextInt();

        System.out.println("BMI is : " + BMI);

        if(BMI < 18.5){

            System.out.println("You are underweight");

        } else if (BMI <=25){

            System.out.println("You are normal");

        } else if (BMI <=30){

            System.out.println("You are overweight");

        } else{

            System.out.println("You are obese");

        }

        IdealBMI.IdealBMI(heightMetars, gender);
    }
}
