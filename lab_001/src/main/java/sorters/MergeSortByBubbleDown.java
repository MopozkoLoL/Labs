package sorters;

import java.util.stream.Stream;

public class MergeSortByBubbleDown extends AbstractSorter {

    public void sort(int[] arr){

        AbstractSorter s = new BubbleSortDown();

        int[] leftHalf = new int[arr.length/2] ;
        System.arraycopy(arr, 0, leftHalf, 0, leftHalf.length);
        int[] rightHalf = new int[arr.length/2] ;
        System.arraycopy(arr, leftHalf.length, rightHalf, 0, rightHalf.length);

        s.sort(leftHalf);
        s.sort(rightHalf);

        String[] both = Stream.of(leftHalf, rightHalf).flatMap(Stream::of)
                .toArray(String[]::new);
    }

    public static int[] joinArrays(int[] first, int[] second) {
        if (first == null) {
            return second;
        }
        if (second == null) {
            return first;
        }
        int[] res = new int[first.length + second.length];

        System.arraycopy(first, 0, res, 0, first.length);
        System.arraycopy(second, 0, res, first.length, second.length);

        return res;}
}

