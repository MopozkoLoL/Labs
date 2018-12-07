package analyzer;

import sorters.AbstractSorter;

public class Analyzer {

    public long measureSortTime(int[] arr, AbstractSorter sorter){
        long start = System.nanoTime();
        sorter.sort(arr);
        long ellapsedNanoSeconds = System.nanoTime() - start;
        return ellapsedNanoSeconds;
    }
}
