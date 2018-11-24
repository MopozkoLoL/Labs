package fillers;

public class ReverseArr implements Filler {

    public int[] fill(int number){
        int[] arr = new int[number];

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = number-i;
        }
        return arr;}

}
