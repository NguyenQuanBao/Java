import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner YEAR = new Scanner(System.in);
        int Year;

        System.out.println("Nhập năm bạn muốn kiểm tra: ");
        Year = YEAR.nextInt();

        if (Year % 4 == 0) {
            if (Year % 100 == 0) {
                if (Year % 400 == 0) {
                    System.out.printf("%d Là năm nhuận", Year);
                } else {
                    System.out.printf("%d không phải năm nhuận", Year);

                }
            } else {
                System.out.printf("%d Là năm nhuận", Year);
            }
        } else {
            System.out.printf("%d Không phải năm nhuận", Year);
        }
    }
}