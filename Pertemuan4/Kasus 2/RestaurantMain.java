import java.io.IOException;
import java.util.Scanner;

public class RestaurantMain extends Pemesanan {

    public static void system(String type) throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", type).inheritIO().start().waitFor();
    }

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);
        char loop = 'y';

        Restaurant res = new Restaurant();
        RestaurantMenu rm = new RestaurantMenu();
        Pemesanan ps = new Pemesanan();
        rm.setMenu(rm);

        while (loop == 'y') {

            rm.printMenu();

            res.readKeyboardMenu();
            if (!res.isMenuTersedia(res.getId())) {
                res.isMenuTersediaErrorMessage();
                system("pause");
            } else {
                System.out.println();
                res.readKeyboardQty();

                if (res.isOutOfRange(res.getQty(), rm)) {
                    res.isOutOfRangeErrorMessage();
                    system("pause");
                } else {
                    res.setNewQty(rm);
                    ps.setDaftarPesanan(res.getId(), res.getQty(), rm);
                    system("cls");
                    rm.printMenu();

                    System.out.print("\nIngin memesan lagi (y/n) : ");
                    loop = sc.next().charAt(0);
                }
            }

            system("cls");
        }
        ps.printDaftarPemesanan();
        sc.close();
        System.out.println("\nTerimakasih Sudah Memesan ditempat kami. :)");
    }
}
