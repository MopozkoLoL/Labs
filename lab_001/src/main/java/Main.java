import analyzer.Analyzer;
import fillers.*;
import output.Outputer;
import sorters.*;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        Analyzer analyzer = new Analyzer();
//        Outputer outputer = new Outputer();
//
//        Map<String, AbstractSorter> sorters = new HashMap<>() {
//            {
//                put("SortUp", new BubbleSortUp());
//                put("SortDown", new BubbleSortDown());
//                put("ArraySort", new ArraysSort());
//                put("QuickSort", new QuickSort());
//                put("MergeSortByBubbleUp", new MergeSortByBubbleUp());
//            }
//        };
//        Map<String, Filler> fillers = new HashMap<>() {
//            {
//                put("Reverse", new ReverseArr());
//                put("Random", new RandomArr());
//                put("SortedArray", new SortedArr());
//                put("SortedArrayWithX", new SortedArrWithX());
//            }
//        };
//        int elementsCount = 10000;
//
//
//        for (Map.Entry<String, AbstractSorter> sorter : sorters.entrySet()) {
//            for (Map.Entry<String, Filler> filler : fillers.entrySet()) {
//                int[] arr = filler.getValue().fill(elementsCount);
//                long time = analyzer.measureSortTime(arr, sorter.getValue());
//                outputer.writter(filler.getKey(), sorter.getKey(), time);
//            }
//        }

    }
}
