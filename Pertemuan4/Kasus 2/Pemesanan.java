import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Pemesanan extends RestaurantMenu {
    private String nama_makanan[];
    private int qtyPemesanan[];
    private double harga_makanan[];
    private double hargaTotal[];
    private byte id = 0;
    private double sum = 0;

    public String getDaftarPesananNamaMakanan(byte id) {
        return this.nama_makanan[id];
    }

    public double getDaftarPesananHargaMakanan(byte id) {
        return this.harga_makanan[id];
    }

    public int getQtyPemesanan(byte id) {
        return qtyPemesanan[id];
    }

    public double getHargaTotal(byte id) {
        return hargaTotal[id];
    }

    public Pemesanan() {
        nama_makanan = new String[11];
        harga_makanan = new double[11];
        qtyPemesanan = new int[11];
        hargaTotal = new double[11];
    }

    public void nextId() {
        id++;
    }

    public void setDaftarPesanan(byte index, int qtyPemesanan, RestaurantMenu rm) {
        // this.nama_makanan[id] = getNama_makanan((byte) ((byte)index-1));
        this.nama_makanan[id] = rm.getNama_makanan((byte) ((byte)index-1));
        this.harga_makanan[id] = rm.getHarga((byte) ((byte)index-1));
        this.qtyPemesanan[id] = qtyPemesanan;
        this.hargaTotal[id] = rm.getHarga((byte) ((byte)index-1)) * qtyPemesanan;
        nextId();
    }

    public void setTotalHargaPemesanan() {
        for (byte i = 0; i <= id; i++) {
            sum += getHargaTotal(i);
        }
    }

    public void printDaftarPemesanan() {
        DecimalFormat df = (DecimalFormat) NumberFormat.getInstance(Locale.US);
        System.out.println("Detail Pemesanan : \n");
        System.out.println("No" + ".\t" + String.format("%-15s", "Makanan") + String.format("%10s", "Jumlah") + String.format("%15s", "Total") + "\n");
        for (byte i = 0; i < id; i++) {
            System.out.println(i+1 + ".\t" + String.format("%-15s", getDaftarPesananNamaMakanan(i)) + String.format("%10s", getQtyPemesanan(i)) + String.format("%15s", "Rp. " + df.format(getDaftarPesananHargaMakanan(i)*getQtyPemesanan(i))));
        }
        setTotalHargaPemesanan();
        System.out.print("\nTotal Bayar : Rp. " + df.format(sum) + "\n");
    }
}
