import java.util.Scanner;

public class Soal1 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		String s = inp.nextLine();
		inp.close();
		String[] stringarray = s.split("[! , ? . _ ' @]+");

		System.out.println(stringarray.length);
		for (int i = 0; i < stringarray.length; i++) {
			System.out.println(stringarray[i]);
		}
	}
}