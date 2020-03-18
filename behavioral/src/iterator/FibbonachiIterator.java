package iterator;

import java.util.Iterator;

public class FibbonachiIterator implements Iterator<Integer> {

    private int current = 0;
    private int previous = 0;
    private int temp = 0;

    private int barier;

    public FibbonachiIterator(int barier) {
        this.barier = barier;
    }

    @Override
    public boolean hasNext() {
        return barier > 0;
    }

    @Override
    public Integer next() {
        barier -=1;
        if (temp == 0) {
            temp = 1;
            return current;
        } else if (previous == 0) {
            previous = 1;
            return previous;
        } else if (current == 0) {
            current = 1;
            return current;
        } else {
            temp = current;
            current = current + previous;
            previous = temp;
            return current;
        }
    }
}
