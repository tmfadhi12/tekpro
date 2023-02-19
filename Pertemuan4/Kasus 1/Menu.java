public class Menu {
	private String[] nama_makanan;
	private double[] harga_makanan;
	private int[] stok;
	public static byte id=0;

	public Menu() {
		nama_makanan = new String[10];
		harga_makanan = new double[10];
		stok = new int[10];
	}
	
	public String getNama_makanan(int kode) {
		return nama_makanan[kode];
	}
	public void setNama_makanan(String nama_makanan) {
		this.nama_makanan[id] = nama_makanan;
	}
	public double getHarga_makanan(int kode) {
		return harga_makanan[kode];
	}
	public void setHarga_makanan(double harga_makanan) {
		this.harga_makanan[id] = harga_makanan;
	}
	public int getStok(int kode) {
		return stok[kode];
	}
	public void setStok(int stok) {
		this.stok[id] = stok;
	}
	public void setStok(int stok, int kode) {
		this.stok[kode] = stok;
	}
	public static void nextId() {
		id++;
	}
	
}
