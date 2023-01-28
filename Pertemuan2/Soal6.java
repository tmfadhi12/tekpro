import java.math.BigInteger;
import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        BigInteger a;
        BigInteger b;

        Scanner sc = new Scanner(System.in);

        a = sc.nextBigInteger();
        b = sc.nextBigInteger();
        sc.close();

        if ( a.compareTo(BigInteger.ZERO) < 0 || b.compareTo(BigInteger.ZERO) < 0 ) {
            System.out.println("bil. tidak boleh negatif");
        }else{
            System.out.println(a.add(b));
            System.out.println(a.multiply(b));
        }
    }
}
