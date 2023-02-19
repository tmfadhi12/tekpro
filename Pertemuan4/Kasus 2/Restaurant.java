import java.util.Scanner;

public class Restaurant extends RestaurantMenu{
    private byte id;
    private int qty;

    public byte getId() {
        return id;
    }

    public int getQty() {
        return qty;
    }

    public void  setNewQty(RestaurantMenu rm) {
        rm.setQty(rm.getQty((byte) ((byte)id-1)) - qty, (byte) ((byte)id-1));
    }

    public void readKeyboardPilihMenu(Scanner sc) {
        System.out.print("Pilih Menu Makanan yang Tersedia (nomor menu) : ");
        id = sc.nextByte();
    }

    public void readKeyboardQtyPemesanan(Scanner sc) {
        System.out.print("Pilih Jumlah Makanan yang di Pesan : ");
        qty = sc.nextInt();
    }

    public void readKeyboardMenu() {
        Scanner sc = new Scanner(System.in);
        readKeyboardPilihMenu(sc);
    }

    public void readKeyboardQty() {
        Scanner sc = new Scanner(System.in);
        readKeyboardQtyPemesanan(sc);
    }

    public void isOutOfRangeErrorMessage() {
        System.out.println("Melebihi Stok yang ada!");
    }

    public boolean isMenuTersedia(byte id) {
        if (id > 10 || id < 1) {
            return false;
        }else{
            return true;
        }
    }

    public void isMenuTersediaErrorMessage() {
        System.out.println("Menu tidak tersedia! silahkan pilih menu lain.");
    }

    public boolean isOutOfRange(int inputQty, RestaurantMenu rm) {
        if (inputQty > rm.getQty((byte) ((byte)id-1))) {
            return true;
        } else {
            return false;
        }
    }
}
