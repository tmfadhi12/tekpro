import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        int numA;
        int numB;
        String simbolOperasi;

        Scanner keyboard = new Scanner(System.in);

        numA = keyboard.nextInt();
        simbolOperasi = keyboard.next();
        numB = keyboard.nextInt();
        keyboard.close();

        int hasil = (simbolOperasi.equals("+")) ? numA + numB
                : (simbolOperasi.equals("-")) ? numA - numB
                        : (simbolOperasi.equals("*")) ? numA * numB
                                : (simbolOperasi.equals("/")) ? (numA % numB == 0) ? numA / numB : 0
                                        : (simbolOperasi.equals("+")) ? numA % numB : 0;

        System.out.println((numA >= 1 && numB >= 1 && numA <= 1000 && numB <= 1000) ? hasil : "Melebihi Range");
    }
}
