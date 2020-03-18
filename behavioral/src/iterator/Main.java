package iterator;

public class Main {

    public static void main(String[] args) {
        FibbonachiIterator fibbonachiIterator = new FibbonachiIterator(7);

        while (fibbonachiIterator.hasNext()){
            System.out.println(fibbonachiIterator.next());
        }
    }
}
