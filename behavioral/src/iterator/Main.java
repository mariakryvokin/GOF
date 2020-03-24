package iterator;

public class Main {

    public static void main(String[] args) {
        FibonacciIterator fibbonachiIterator = new FibonacciIterator(7);

        while (fibbonachiIterator.hasNext()){
            System.out.println(fibbonachiIterator.next());
        }
    }
}
