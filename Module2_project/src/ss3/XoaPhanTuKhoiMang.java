package ss3;

import java.util.Scanner;
import java.util.Arrays;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] originalArray = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập chỉ số phần tử bạn muốn xóa (0 đến " + (originalArray.length - 1) + "):");
        int n = sc.nextInt();
        int[] newArray = new int[originalArray.length - 1];
        int j = 0;

        for (int i = 0; i < originalArray.length; i++) {
            if (i != n) {
                newArray[j] = originalArray[i];
                j++;
            }
        }

        System.out.println("Mảng sau khi xóa phần tử tại chỉ số " + n + ": " + Arrays.toString(newArray));
    }
}