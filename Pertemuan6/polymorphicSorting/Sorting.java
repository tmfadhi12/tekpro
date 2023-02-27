/**
 * Sorting
 */
public class Sorting {

    public static void selectionShort(Comparable[] list) {
        int min;
        Comparable temp;
        
        for (int i = 0; i < list.length-1; i++) {
            min = i;
            for (int j = i+1; j < list.length; j++) {
                if(list[j].compareTo(list[min]) < 0){
                    min = j;
                }
                temp = list[min];
                list[min] = list[i];
                list[i] = temp;
            }
        }
    }
    

    public static void insertionSort(Comparable[] list) {
        for (int i = 0; i < list.length; i++) {
            Comparable key = list[i];
            int position = i;

            while (position > 0 && key.compareTo(list[position-1]) > 0) {
                list[position] = list[position-1];
                position--;
            }

            list[position] = key;
        }
    }
}