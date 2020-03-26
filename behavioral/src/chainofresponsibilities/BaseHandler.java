package chainofresponsibilities;

public abstract class BaseHandler implements  Filter {

    protected Filter next;

    @Override
    public void addNext(Filter filter) {
        next = filter;
    }

    @Override
    public boolean hasNext() {
        return next != null;
    }

}
