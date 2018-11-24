package output;

public class Outputer {
    public void writter(String FillerName, String SorterName, long time){
        String mesage = String.format("Array filed by %s was sorted by %s in  %d ms", FillerName, SorterName, time/1000000);
        System.out.println( mesage );
    }
}
