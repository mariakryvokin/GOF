package chainofresponsibilities;

public interface Filter {

    void addNext(Filter filter);
    boolean hasNext();
    void handleRequest(RequestBody requestBody);
}
