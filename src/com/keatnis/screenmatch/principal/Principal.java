package com.keatnis.screenmatch.principal;

import com.keatnis.screenmatch.calculos.FiltroRecomendacion;
import com.keatnis.screenmatch.mod.Episodio;
import com.keatnis.screenmatch.mod.Pelicula;
import com.keatnis.screenmatch.mod.Serie;
import com.keatnis.screenmatch.calculos.CalculadoraDeTiempo;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula("Wall-e",2013);
        pelicula.setDuracionMinutos(20);
        pelicula.setIncluidoEnELPlan(true);
        pelicula.mostrarFichaTecnica();
        pelicula.evalua(9.8);
        pelicula.evalua(8);
        System.out.println(pelicula.getTotalDeEvaluaciones());
        System.out.println("Media de las evaluaciones " + pelicula.calcularMedia());


        Serie casaDragron = new Serie("La casa del dragon", 2022);

        casaDragron.setTemporadas(1);
        casaDragron.setEpisodiosPorTemporada(10);
        casaDragron.setMinutosPorEpisodio(50);
        casaDragron.setDuracionMinutos(casaDragron.getMinutosPorEpisodio() * casaDragron.getEpisodiosPorTemporada());


        Pelicula nuevaPelicula = new Pelicula("Matrix", 1998);

        nuevaPelicula.setDuracionMinutos(180);
        nuevaPelicula.evalua(9);
        nuevaPelicula.evalua(10);
//        nuevaPelicula.mostrarFichaTecnica();

        CalculadoraDeTiempo calculadoraDeTiempo = new CalculadoraDeTiempo();
        calculadoraDeTiempo.incluye(pelicula);
        calculadoraDeTiempo.incluye(casaDragron);
        calculadoraDeTiempo.incluye(nuevaPelicula);
        System.out.println("Tiempo necesario para ver tus titulos favoritos en estas vacaciones: " +
                calculadoraDeTiempo.getTiempoTotal());

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(nuevaPelicula);

        Episodio episodio = new Episodio();
        episodio.setNombre("La casa targaryen");
        episodio.setSerie(casaDragron);
        episodio.setTotalVisualizaciones(50);
        filtroRecomendacion.filtra(episodio);

        var peliculaDeMaria = new Pelicula("El senior de los anillos ", 2001);

        peliculaDeMaria.setDuracionMinutos(100);

        ArrayList<Pelicula> listaPelicula = new ArrayList<>();
        listaPelicula.add(pelicula);
        listaPelicula.add(nuevaPelicula);
        listaPelicula.add(peliculaDeMaria);

        System.out.println("Tamanio de la lista " + listaPelicula.size());
        // despues de agragar el toString a la clase pelicula se mostarran los datos y no como objeto
        // podemos sobreescribir a los metodos de la clase object (toString())
        System.out.println("Tamanio de la lista " + listaPelicula);

        System.out.println("La primera pelicula es: " + listaPelicula.get(0).getNombre() +" se lanzo en "+ listaPelicula.get(0).getFechaDeLanzamiento());

        System.out.println("to String a: " + listaPelicula.get(0).toString());
    }

}
