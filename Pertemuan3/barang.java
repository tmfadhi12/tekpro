public class barang {
    String kode_barang;
    String nama_barang;
    private int stok;

    public barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }

    public int getStock() {
        return stok;
    }

    public void tambahStok(int add) {
        stok += add;
    }
}