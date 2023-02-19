import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Restaurant extends Menu {
		public void tambahMenuMakanan(String nama, double harga, int stok) {
		setNama_makanan(nama);
		setHarga_makanan(harga);
		setStok(stok);
	}
	
	public void tampilMenuMakanan() {
		for(int i = 0; i <= id; i++) {
			if(!isOutOfStock(i)) {
				System.out.println(i+1 +  " "  + getNama_makanan(i) + "[" + getStok(i) + "]" + "\tRp. " + getHarga_makanan(i));
			}
		}
	}
	
	public boolean isOutOfStock(int id) {
		if(getStok(id) == 0) return true;
		else return false;
	}
	
	
	public void pesan(byte kode, int jumlah) {
		if(cekStok(kode, jumlah)) {
			decreaseStok(kode, jumlah);
			DecimalFormat df = (DecimalFormat) NumberFormat.getInstance(Locale.US);
			System.out.println("Harga yang harus dibayar : Rp. " + df.format(getHarga_makanan(kode-1)*jumlah));
		} else {
			System.out.println("Stok makanan tidak cukup");
		}
	}
	
	
	private boolean cekStok(byte kode, int jumlah) {
		if(getStok(kode-1) - jumlah < 0) return false;
		else return true;
	}
	
	private void decreaseStok(byte kode, int jumlah) {
		setStok(getStok(kode-1)-jumlah, kode-1);
	}
	
}
