package chainofresponsibilities;

public class Client {


    public static void main(String[] args) {
        Server server = new Server();
        server.getUserPassword().put("user","password");
        server.getUserNameRole().put("user","role");
        Filter authentication = new Authentication(server);
        Filter authorization = new Authorization(server);
        authentication.addNext(authorization);
        RequestBody requestBody = new RequestBody("user","password","role");
        authentication.handleRequest(requestBody);

    }
}
