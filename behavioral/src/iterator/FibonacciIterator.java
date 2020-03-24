package iterator;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {

    private int count = -1;
    private int current = 1;
    private int previous = 1;
    private int temp = 0;

    private int barrier;

    public FibonacciIterator(int barier) {
        this.barrier = barier;
    }

    @Override
    public boolean hasNext() {
        return count <= barrier;
    }

    @Override
    public Integer next() {
        count++;
        if(count <= 1 ){
            return 1;
        }
        else {
            temp = current;
            current = current + previous;
            previous = temp;
            return current;
        }
    }
}
