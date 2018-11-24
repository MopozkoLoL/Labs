package fillers;

import java.util.Random;

public class SortedArrWithX implements Filler {

    public int[] fill(int number){
        int[] arr = new int[number+1];

        for (int i = 0; i <number ; i++) {
            arr[i] = i;
        }
        Random r = new Random();
        arr[number]=r.nextInt();
        return arr;
    }

}
