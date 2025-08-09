package ss4;

public class PhuongTrinhBac2 {
    private int a;
    private int b;
    private int c;

    public PhuongTrinhBac2(int a, int b, int c) {
        if (a == 0) {
            System.out.println("Hệ số a phải khác 0 để là phương trình bậc hai.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double tinhDelta() {
        return b * b - 4 * a * c;
    }

    public void timX() {
        double delta = tinhDelta();
        System.out.println("Delta của phương trình là: " + delta);

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có 2 nghiệm phân biệt:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép:");
            System.out.println("x = " + x);
        } else {
            System.out.println("Phương trình vô nghiệm thực.");
        }
    }
}
