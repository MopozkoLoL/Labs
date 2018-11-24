package analyzer;

import sorters.SorterArr;

public class Analyzer {

    public long measureSortTime(int[] arr, SorterArr sorter){
        long start = System.nanoTime();
        sorter.sort(arr);
        long ellapsedNanoSeconds = System.nanoTime() - start;
        return ellapsedNanoSeconds;
    }
}
