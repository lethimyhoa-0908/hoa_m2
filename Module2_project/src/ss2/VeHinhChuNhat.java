package ss2;
import java.util.Scanner;
public class VeHinhChuNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều rộng: ");
        int width = scanner.nextInt();

        System.out.print("Nhập chiều cao: ");
        int height = scanner.nextInt();
        System.out.println("Hình chữ nhật:");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
