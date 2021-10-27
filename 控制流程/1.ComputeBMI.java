import java.util.*;
public class ComputeBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input your height(m):");
        double height = sc.nextDouble();
        System.out.println("input your weight(kg):");
        double weight = sc.nextDouble();
        double bmi = weight / (height*height);
        System.out.println("Your BMI is " + bmi);
        if (bmi < 18.5){
            System.out.println("Underweight");
        }
        else if (bmi<25){
            System.out.println("Normal");
        }
        else if (bmi<30){
            System.out.println("Overweight");
        }
        else{
            System.out.println("Obese");
        }
    }
}
