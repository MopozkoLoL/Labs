package fillers;

import java.util.Random;

public class RandomArr implements Filler {

    public int[] fill(int lenght) {
        int[] arr = new int[lenght];
        Random generater = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = generater.nextInt(35);
        }
        return arr;
    }

}