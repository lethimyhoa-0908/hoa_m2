package ss1.thuc_hanh;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        System.out.println("Nhap so tien USD:");
        double USDtoVND = 26000;
        Scanner sc = new Scanner(System.in);
        double USD = sc.nextDouble();
        double VND = USD * USDtoVND;
        System.out.println("So tien tu USD sang VND la: " + VND);
    }
}