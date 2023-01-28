import java.text.DecimalFormat;
import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        int gajipokok = 500000;
        int hargaperitem = 50000;
        int itemterjual;

        Scanner sc = new Scanner(System.in);

        itemterjual = sc.nextInt();
        sc.close();

        double totalgaji = (itemterjual >= 40) ? gajipokok + ((itemterjual * hargaperitem) * 0.25)
                : (itemterjual > 80) ? gajipokok + ((itemterjual * hargaperitem) * 0.35)
                        : (itemterjual < 15) ? gajipokok - (((15 - itemterjual) * hargaperitem) * 0.15)
                                : gajipokok + ((itemterjual * hargaperitem) * 0.10);

        DecimalFormat ft = new DecimalFormat("0");
        System.out.println(ft.format(totalgaji));
    }
}
