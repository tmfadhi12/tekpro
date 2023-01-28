import java.math.BigInteger;
import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        int[] plat = new int[4];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            plat[i] = sc.nextInt();
        }

        sc.close();

        String plat1 = Integer.toString(plat[0]);
        String plat2 = Integer.toString(plat[1]);
        String plat3 = Integer.toString(plat[2]);
        String plat4 = Integer.toString(plat[3]);

        String s = plat1 + plat2 + plat3 + plat4;

        Long res = Long.parseLong(s);

        Long hasil = (res - 999999) % 5;

        String output = (hasil == 0) ? "jalan" : "berhenti";

        System.out.println(output);
    }
}
