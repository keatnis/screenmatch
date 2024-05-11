package com.keatnis.screenmatch.principal;

import com.google.gson.Gson;
import com.keatnis.screenmatch.mod.Titulo;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba el nombre de una pelicula");
        String apikey="57e2a7ad";
        var busqueda=  teclado.nextLine();

        String direccion = "https://www.omdbapi.com/?t=" + busqueda+"&apikey="+apikey ;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(response.body());

        //usando la herramienta mvn repository agragamos la libreria : gson que permite convertir json a clase java y viceversa
        Gson gson = new Gson();
        Titulo miTitulo= gson.fromJson(json, Titulo.class);

        System.out.println("nombre pelicula: "+miTitulo);
    }
}
