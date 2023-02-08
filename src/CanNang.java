import java.util.Scanner;

public class CanNang {
    public static void main(String[] args) {
        Scanner bmi = new Scanner(System.in);
        Double Weight, Height, BMI;

        System.out.print("Cân nặng của bạn(KG):");
        Weight = bmi.nextDouble();

        System.out.print("Chiều cao của bạn(Mét):");
        Height = bmi.nextDouble();

        BMI= Weight / Math.pow(Height,2);

        System.out.printf("%-20s%s", "BMI", "Interpretation\n");

        if (BMI < 18)
            System.out.printf("%-20.2f%s", BMI, "Gầy");
        else if (BMI < 25.0)
            System.out.printf("%-20.2f%s", BMI, "Bình thường");
        else if (BMI < 30.0)
            System.out.printf("%-20.2f%s", BMI, "Hơi mập");
        else
            System.out.printf("%-20.2f%s", BMI, "Béo");
    }
}
