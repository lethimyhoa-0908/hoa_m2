package ss3;

import java.util.Scanner;
import java.util.Arrays;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] originalArray = {10, 20, 30, 40, 60};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị bạn muốn thêm vào");
        int n = sc.nextInt();
        int[] newArray = new int[originalArray.length + 1];
        for (int i = 0, j = 0; i < originalArray.length; i++) {
            if (i == j) {
                newArray[j] = originalArray[i];
                j++;
            } else {
                newArray[j] = n;
            }
        }

        System.out.println("Mảng sau khi them moi la:  " + Arrays.toString(newArray));
    }
}