import java.text.DecimalFormat;
import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        String[] str = new String[3];
        double[] angka = new double[3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            str[i] = sc.next();
            angka[i] = sc.nextDouble();
            if (angka[i]>999 || angka[i] < 0) {
                System.out.println("melebihi range (range : 0-999)");
                System.exit(i);
            }
        }
        sc.close();

        DecimalFormat ft = new DecimalFormat("000");

        for (int i = 0; i < 3; i++) {
            System.out.println(String.format("%-9s", str[i]) + String.format( "%9s", ft.format(angka[i])));
        }
    }
}
