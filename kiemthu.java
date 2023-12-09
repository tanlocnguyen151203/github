import java.util.Locale;
public static void main(String[] args) {
        double soA = 200;
        double soB = 100;

        System.out.println(String.format(Locale.US, "Kết quả của phép cộng %.2f + %.2f là: %.2f", soA, soB, PhepToan.tong(soA, soB)));
        System.out.println(String.format(Locale.US, "Kết quả của phép trừ %.2f - %.2f là: %.2f", soA, soB, PhepToan.hieu(soA, soB)));
        System.out.println(String.format(Locale.US, "Kết quả của phép nhân %.2f * %.2f là: %.2f", soA, soB, PhepToan.tich(soA, soB)));
        System.out.println(String.format(Locale.US, "Kết quả của phép chia %.2f / %.2f là: %.2f", soA, soB, PhepToan.thuong(soA, soB)));
        System.out.println(String.format(Locale.US, "Kết quả của phép cân bậc hai của %.2f là: %.2f", soA, PhepToan.canBacHai(soA)));
    }