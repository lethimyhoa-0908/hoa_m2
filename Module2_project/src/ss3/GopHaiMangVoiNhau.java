package ss3;

import java.util.Scanner;
import java.util.Arrays;

public class GopHaiMangVoiNhau {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 40, 60};
        int[] array2 = {1, 2, 3, 4, 5};

        int[] newArray = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            newArray[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            newArray[array1.length + i] = array2[i];
        }

        System.out.println("Mảng sau khi gộp là: " + Arrays.toString(newArray));
    }
}