package fillers;

import Annotations.Filler;

import java.util.Random;

public  class Fillers {

    @Filler
    public static int[] randomArr(int lenght) {
        int[] arr = new int[lenght];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
        }
        return arr;
    }

    @Filler
    public static int[] reverseArr(int number){
        int[] arr = new int[number];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = number-i;
        }
        return arr;
    }

    @Filler
    public static int[] sortedArr(int number) {
        Random random = new Random();
        int[] arr = new int[number];
        arr[0] = random.nextInt();
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i-1] + random.nextInt();
        }
        return arr;
    }

    @Filler
    public static int[] sortedArrWithX(int number){
        int[] arr = new int[number];
        Random random = new Random();
        arr[0] = random.nextInt();
        for (int i = 1; i <arr.length-1 ; i++) {
            arr[i] = arr[i-1] + random.nextInt();
        }
        Random r = new Random();
        arr[number-1]=r.nextInt();
        return arr;
    }
}
