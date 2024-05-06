package com.keatnis.screenmatch.mod;

import com.keatnis.screenmatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {
    String director;

    public Pelicula(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }


    //todas las clases ocupan el object, pero este se agrega para para una nueva implementacion usando Arraylist
    // y se mostaran los datos y no el Object
    // sobreescribiendo la clase toSreing() desde esta clase
    @Override
    public String toString() {
        return "Pelicula: " + this.getNombre() + "( " + this.getFechaDeLanzamiento() + " )";
    }

    @Override
    public int getClasificacion() {
        return (int) calcularMedia()/2;
    }
}
