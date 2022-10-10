// import java.io.IOException;
// import java.io.OutputStream;
// import java.net.InetSocketAddress;

// import com.sun.net.httpserver.HttpExchange;
// import com.sun.net.httpserver.HttpHandler;
// import com.sun.net.httpserver.HttpServer;

// public class hello {

//  public static void main(String[] args) throws IOException {
//   HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
//   server.createContext("/", new CustomHandler());
//   server.start();
//   if (server != null) {
//    System.out.println("Server started");
//   }
//  }
// }

// class CustomHandler implements HttpHandler {

//  @Override

//  public void handle(HttpExchange exchange) throws IOException {
//   String requestMethod = exchange.getRequestMethod();

//   String query = exchange.getRequestURI().getQuery();

//   String response = "<b>Hello world !</b></br>Methode : " + requestMethod + "</br>" + "Requete : " + query;
//   exchange.sendResponseHeaders(200, response.length());
//   OutputStream os = exchange.getResponseBody();
//   os.write(response.getBytes());
//   os.close();
//  }

// }

public class hello {

     public static void main(String[] args) {
        System.out.println("Hello World");
     }
    }