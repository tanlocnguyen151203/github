import java.util.Locale;

public class PhepToan {
    public static double tong(double a, double b) {
        double c = a + b;
        if (Double.isNaN(c)) {
            System.out.println("Số nhập vào không phải là số");
        }
        return c;
    }

    public static double hieu(double a, double b) {
        double c = a - b;
        return c;
    }

    public static double tich(double a, double b) {
        double c = a * b;
        return c;
    }

    public static double thuong(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Không thể chia cho 0");
        } else {
            double c = a / b;
            return c;
        }
    }

    public static double canBacHai(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Không thể tính căn bậc hai của số âm");
        } else {
            return Math.sqrt(number);
        }
    }
}
