import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Integer[] intList;
        int size;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nHow many integers do you want to short ? ");
        size = sc.nextInt();
        intList = new Integer[size];

        System.out.println("\nEnter the numbers...");

        for (int i = 0; i < size; i++) {
            intList[i] = sc.nextInt();
        }

        Sorting.selectionShort(intList);

        System.out.println("\nYour numbers in sorted (SelectionSort) order...");
        for (int j = 0; j < size; j++) {
            System.out.println(intList[j] + " ");
        }
        System.out.println();

        Sorting.insertionSort(intList);

        System.out.println("\nYour numbers in sorted (InsertionShort) order...");
        for (int j = 0; j < size; j++) {
            System.out.println(intList[j] + " ");
        }
        System.out.println();

        sc.close();
    }
}
