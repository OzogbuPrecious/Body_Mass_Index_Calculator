import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float height;
        float weight;
        float BMI;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your weight (kg): ");
        weight = scanner.nextFloat();

        System.out.println("Enter your height (m): ");
        height = scanner.nextFloat();

        BMI = weight/(height*height);

            if (BMI < 18.5){
                System.out.format("BMI: %.2f", BMI);
                System.out.println("\nYou are underweight");
            } else if (BMI >= 18.5 && BMI <= 24.9) {
                System.out.format("BMI: %.2f", BMI);
                System.out.println("\nYou are normal weight");
            } else if (BMI >= 25) {
                System.out.format("BMI: %.2f", BMI);
                System.out.println("\nYou are overweight");
            } else if (BMI >= 30) {
                System.out.format("BMI: %.2f", BMI);
                System.out.println("\nYou are obese");
            }

        }
    }
