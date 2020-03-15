package chainofresponsibilities;

public class Authentication implements Filter {

    private Filter filter;
    private Server authenticationServer;

    public Authentication(Server authenticationServer) {
        this.authenticationServer = authenticationServer;
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
        if (authenticationServer.authenticate(requestBody.getUserName(), requestBody.getPassword())) {
            System.out.println("User was authenticated");
            if (hasNext()) {
                filter.handleRequest(requestBody);
            }
        } else {
            throw new RuntimeException("User doesn't exist");
        }
    }
}
