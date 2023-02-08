import java.util.Scanner;

public class toantu {
    public static void main(String[] args) {
        float Width;
        float Height;

        Scanner ToanTu = new Scanner(System.in);
        System.out.println("Nhập Chiều dài: ");
        Width = ToanTu.nextFloat();

        System.out.println("Nhập chiều rộng: ");
        Height = ToanTu.nextFloat();

        float Dientich = Width * Height ;
        System.out.println("Diện tích là: " + Dientich);
    }
}
