package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Titulo;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.omdbapi.com/?i=tt3896198&apikey=767e22b0"))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json =response.body();
        // Response body será o cara que imprimir o json, ou seja, serializar
        //TODO: salve this to Git Book


        System.out.println(json);

        Gson gson = new Gson();
        Titulo meuTitulo = gson.fromJson(json, Titulo.class);
    System.out.println("Titulo:" + meuTitulo.getNome());

    }
}
