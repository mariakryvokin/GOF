package chainofresponsibilities;

public class Authorization implements Filter {

    private Filter filter;
    private Server server;

    public Authorization(Server server) {
        this.server = server;
    }

    @Override
    public void addNext(Filter filter) {
        this.filter = filter;
    }

    @Override
    public boolean hasNext() {
        return filter != null;
    }

    @Override
    public void handleRequest(RequestBody requestBody) {
        if (server.authorize(requestBody.getUserName(), requestBody.getRole())) {
            System.out.println("User was authorize");
            if (hasNext()) {
                filter.handleRequest(requestBody);
            }
        } else {
            throw new RuntimeException("User hasn't such rights");
        }

    }
}
