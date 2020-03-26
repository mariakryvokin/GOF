package chainofresponsibilities;

public class Authorization extends BaseHandler {
    private Server server;

    public Authorization(Server server) {
        this.server = server;
    }

    @Override
    public void handleRequest(RequestBody requestBody) {
        if (server.authorize(requestBody.getUserName(), requestBody.getRole())) {
            System.out.println("User was authorize");
            if (hasNext()) {
                next.handleRequest(requestBody);
            }
        } else {
            throw new RuntimeException("User hasn't such rights");
        }

    }
}
