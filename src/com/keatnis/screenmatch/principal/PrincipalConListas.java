package com.keatnis.screenmatch.principal;

import com.keatnis.screenmatch.mod.Pelicula;
import com.keatnis.screenmatch.mod.Serie;
import com.keatnis.screenmatch.mod.Titulo;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;

public class PrincipalConListas {

    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula("Wall-e", 2013);
        Pelicula nuevaPelicula = new Pelicula("Matrix", 1998);
        var peliculaDeMaria = new Pelicula("El senior de los anillos ", 2001);

        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(pelicula);
        lista.add(nuevaPelicula);
        lista.add(peliculaDeMaria);
        lista.add(lost);

        Collections.sort(lista);

        System.out.println("lista ordenada con comparable: " + lista);
        // comparar usando comparator ademas de ordenar con comparable
        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("lista ordenada por fecha: " +lista);
        for(Titulo item : lista){
          //  System.out.println(item.getNombre());
            // si este es del tipo pelicula entonces se ejecuta lo siguiente, se hace lka instacia de pelicula con pelicula1

            if(item instanceof Pelicula pelicula1 && pelicula.getClasificacion() > 2){
                 System.out.println("Clasificacion: "+pelicula1.getClasificacion());
            }
        }

        ArrayList<String> listaArtistas= new ArrayList<>();
        listaArtistas.add("Penelope Cruz");
        listaArtistas.add("Antonio Banderas");
        listaArtistas.add("Juan Gabriel");

       // System.out.println(listaArtistas);
        //ordenar listas usando la libreria collections
        Collections.sort(listaArtistas);
        System.out.println(listaArtistas);


    }
}
