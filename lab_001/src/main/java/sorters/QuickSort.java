package sorters;

public class QuickSort implements SorterArr {

    public static void sort(int[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < array[middle]) {
                i++;
            }

            while (array[j] > array[middle]) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            sort(array, low, j);

        if (high > i)
            sort(array,j+1, high);
    }

    public void sort (int[] arr){
        sort(arr, 0, arr.length-1);
    }

}
