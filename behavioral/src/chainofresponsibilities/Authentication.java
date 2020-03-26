package chainofresponsibilities;

public class Authentication extends BaseHandler {

    private Server authenticationServer;

    public Authentication(Server authenticationServer) {
        this.authenticationServer = authenticationServer;
    }


    @Override
    public void handleRequest(RequestBody requestBody) {
        if (authenticationServer.authenticate(requestBody.getUserName(), requestBody.getPassword())) {
            System.out.println("User was authenticated");
            if (hasNext()) {
                next.handleRequest(requestBody);
            }
        } else {
            throw new RuntimeException("User doesn't exist");
        }
    }
}
