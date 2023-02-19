import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class RestaurantMenu {
    private String[] nama_makanan;
    private double[] harga;
    private int[] qty;
    private byte id = 0;

    public RestaurantMenu(){
        nama_makanan = new String[10];
        harga = new double[10];
        qty = new int[10];
    }

    public double getHarga(byte id) {
        return harga[id];
    }

    public void setHarga(double harga) {
        this.harga[id] = harga;
    }

    public String getNama_makanan(byte id) {
        return nama_makanan[id];
    }

    public void setNama_makanan(String nama_makanan) {
        this.nama_makanan[id] = nama_makanan;
    }

    public int getQty(byte id) {
        return qty[id];
    }

    public void setQty(int qty, byte id) {
        this.qty[id] = qty;
    }

    public void nextId() {
        id++;
    }

    public void setMenu(RestaurantMenu rm) {     
        rm.setNama_makanan("Bakso");
        rm.setHarga(25_000);
        rm.setQty(15, id);
        rm.nextId();

        rm.setNama_makanan("Mie Ayam");
        rm.setHarga(15_000);
        rm.setQty(50, id);
        nextId();

        rm.setNama_makanan("Nuggets");
        rm.setHarga(20_000);
        rm.setQty(70, id);
        nextId();

        rm.setNama_makanan("Steak");
        rm.setHarga(50_000);
        rm.setQty(10, id);
        nextId();

        rm.setNama_makanan("Spaghetti");
        rm.setHarga(90_000);
        rm.setQty(40, id);
        nextId();

        rm.setNama_makanan("Indomie");
        rm.setHarga(15_000);
        rm.setQty(100, id);
        nextId();

        rm.setNama_makanan("Sausage");
        rm.setHarga(25_000);
        rm.setQty(90, id);
        nextId();

        rm.setNama_makanan("Kue Tar");
        rm.setHarga(40_000);
        rm.setQty(50, id);
        nextId();

        rm.setNama_makanan("Ayam Goreng");
        rm.setHarga(12_000);
        rm.setQty(50, id);
        nextId();

        rm.setNama_makanan("Mie Bakar");
        rm.setHarga(10_000);
        rm.setQty(50, id);
        nextId();
    }

    public boolean isOutOfStock(int id) {
        if (qty[id] == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void printMenu() {
        DecimalFormat df = (DecimalFormat) NumberFormat.getInstance(Locale.US);
        System.out.println("No" + ".\t" + String.format("%-15s", "Makanan") + String.format("%10s", "Stok") + String.format("%15s", "Harga/Porsi") + "\n");
        for (byte i = 0; i < id; i++) {
            if(!isOutOfStock(i))
            System.out.println(i+1 + ".\t" + String.format("%-15s", getNama_makanan(i)) + String.format("%10s", getQty(i)) + String.format("%15s", "Rp. " + df.format(getHarga(i))));
        }
    }


}
