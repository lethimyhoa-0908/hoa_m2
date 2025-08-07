package ss2;

public class hienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int number = 2;

        System.out.println("cac so nguyen to nho hon 100 la: ");
        while (number <= 100) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
            number++;
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2 || n > 100) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

