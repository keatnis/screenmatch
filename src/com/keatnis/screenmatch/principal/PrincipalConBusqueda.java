package com.keatnis.screenmatch.principal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.keatnis.screenmatch.exception.ErrorEnConversionEnDuracionException;
import com.keatnis.screenmatch.mod.Titulo;
import com.keatnis.screenmatch.mod.TituloOmdb;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner teclado = new Scanner(System.in);

        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        while (true) {
            System.out.println("Escriba el nombre de una pelicula");
            String apikey = "57e2a7ad";
            var busqueda = teclado.nextLine();
            if (busqueda.equalsIgnoreCase("salir")) {
                break;
            }

            try {
                //Usando la clase URLEncoder para cambiar el espacio con +
                String direccion = "https://www.omdbapi.com/?t=" + URLEncoder.encode(busqueda) +
                        "&apikey=" + apikey;

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
            //    System.out.println(response.body());

                //usando la herramienta mvn repository agragamos la libreria : gson que permite convertir json a clase java y viceversa
                //los nombres de los param deben de ser iguales que el del archivo json y comvertirlos a mayuscula la primera letra usan gson


                TituloOmdb miTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                //System.out.println("nombre pelicula: "+miTituloOmdb);
                //usando los iguiente pasamos los dfatos de un DTO (mititulo|Omdb) a la clase Titulo
                //manejamos excepciones

                Titulo miTitulo = new Titulo(miTituloOmdb);
              //  System.out.println(miTitulo.toString());
                titulos.add(miTitulo);


            } catch (NumberFormatException e) {
                System.out.println("Ocurrio un error: *");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {

                System.out.println(e.getMessage());
            } catch (ErrorEnConversionEnDuracionException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("finalizo el programa");
        FileWriter file = new FileWriter("titulos.json");
        file.write(gson.toJson(titulos));
        file.close();
        //finally se usa para cerrar el try ya sean conexiones a bases de datos o archivos
        // la excepción más genérica, en este caso Exception, debe declararse en el último bloque catch
    }


}
