package br.com.alura.conversor.modelos;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Endereco {
    void encontrarEndereco(String newURL, double urlAmount, String urlBaseCode, String urlTargetCode) throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(newURL)).build();
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString()).thenApply(HttpResponse::body).thenAccept(System.out::println).join();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        URL url = new URL(newURL);
        HttpURLConnection requests = (HttpURLConnection) url.openConnection();
        requests.connect();

        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) requests.getContent()));
        JsonObject jsonobj = root.getAsJsonObject();
        var valorConvertido = jsonobj.get("conversion_result").getAsString();

        System.out.println("\nValor " + urlAmount + " [" + urlBaseCode + "]" + " corresponde ao valor final de " + valorConvertido + " [" + urlTargetCode + "]");
    }
}
