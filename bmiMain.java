import java.util.Scanner;
public class bmiMain {
    static double pToKg = 0.45359237;
    static double iToM = 0.0254;
    static double under = 18.5;
    static double normal = 25.0;
    static double over = 30.0;
    public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
        System.out.print("Enter weight in pounds: ");
        double pWeight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double iHeight = input.nextDouble();

        double kWeight = pWeight * pToKg;
        double mHeight = iHeight * iToM;
        double BMI = kWeight / Math.pow(mHeight, 2);
        System.out.print("BMI is " + BMI);
        if(BMI < under){
            System.out.print("\nUnderweight");
        }
        if(BMI >= under){
            System.out.print("\nNormal");
        }
        if(BMI >= normal){
            System.out.print("\nOverweight");
        }
        if(BMI >= over){
            System.out.print("\nObese");
        }



    }

}

}
