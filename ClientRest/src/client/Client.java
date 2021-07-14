package client;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Client {

    public static void main(String[] args) throws Exception {

        String puerto = "http://localhost:8084";
        String server = "/JPA-v1/webresources/clientes/v1";
        String url;

        url = puerto + server + "/all";
        System.out.println("****************************************************");
        System.out.println("Servicio ClienteAll");
        System.out.println(url);
        System.out.println(responseBody(url));

        url = puerto + server + "/save?nombre=Juan&apellido=Morra&edad=40&direccion=Capital&email=dggg@mail&telefono=99999999&tipoDocumento=DNI&numeroDocumento=22000111";
        System.out.println("****************************************************");
        System.out.println("Servicio ClienteAlta");
        System.out.println(url);
        System.out.println(responseBody(url));

        url = puerto + server + "/byId?id=4";
        System.out.println("****************************************************");
        System.out.println("Servicio Cliente ById");
        System.out.println(url);
        System.out.println(responseBody(url));

        url = puerto + server + "/remove?id=3";
        System.out.println("****************************************************");
        System.out.println("Servicio Cliente Baja");
        System.out.println(url);
        System.out.println(responseBody(url));

        url = puerto + server + "/likeApellido?apellido=Deguer";
        System.out.println("****************************************************");
        System.out.println("Servicio Cliente LikeApellido");
        System.out.println(url);
        System.out.println(responseBody(url));
        
        url = puerto + server + "/likeNombre?nombre=Fernando";
        System.out.println("****************************************************");
        System.out.println("Servicio Cliente LikeNombre");
        System.out.println(url);
        System.out.println(responseBody(url));
        
        url = puerto + server + "/byDocumento?tipoDocumento=DNI&numeroDocumento=77777777";
        System.out.println("****************************************************");
        System.out.println("Servicio Cliente ByDocumento");
        System.out.println(url);
        System.out.println(responseBody(url));
        
        
        

    }

    private static String responseBody(String url) throws InterruptedException, IOException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        response.headers().map().forEach((k, v) -> System.out.println(k + " " + v));
        return response.body();
    }

}
