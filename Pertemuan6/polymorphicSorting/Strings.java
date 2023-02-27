import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String[] strList;
        int size;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nHow many strings do you want to short ? ");
        size = sc.nextInt();
        strList = new String[size];

        System.out.println("\nEnter the strings...");

        for (int i = 0; i < size; i++) {
            strList[i] = sc.next();
        }

        Sorting.selectionShort(strList);

        System.out.println("\nYour strings in sorted (SelectionSort) order...");
        for (int j = 0; j < size; j++) {
            System.out.println(strList[j] + " ");
        }
        System.out.println();

        Sorting.insertionSort(strList);

        System.out.println("\nYour strings in sorted (InsertionSort) order...");
        for (int j = 0; j < size; j++) {
            System.out.println(strList[j] + " ");
        }
        System.out.println();

        sc.close();
    }
}
