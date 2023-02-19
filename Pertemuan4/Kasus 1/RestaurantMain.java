import java.util.*;

public class RestaurantMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jumlah = 0;
		byte id = 0;
		
		Restaurant resto = new Restaurant();
		resto.tambahMenuMakanan("Bala-Bala", 1_000, 20);
		Restaurant.nextId();
		resto.tambahMenuMakanan("Gehu", 1_000, 20);
		Restaurant.nextId();
		resto.tambahMenuMakanan("Tahu", 1_000, 100);
		Restaurant.nextId();
		resto.tambahMenuMakanan("Molen", 1_000, 20);
		
		Scanner sc = new Scanner(System.in);
		
		resto.tampilMenuMakanan();
		
		System.out.print("Pilih makanan yang dipesan : ");
		id = sc.nextByte();
		
		System.out.print("Berapa Banyak yang dipesan : ");
		jumlah = sc.nextInt();
		
		resto.pesan(id, jumlah);

		sc.close();
		
	}

}
