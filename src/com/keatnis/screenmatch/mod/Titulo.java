package com.keatnis.screenmatch.mod;

import com.google.gson.annotations.SerializedName;
import com.keatnis.screenmatch.calculos.Clasificacion;
//usando comparable para comparar y ordenar los nombres de los titulos
public class Titulo implements Comparable <Titulo> {
    /*
        usando gson
        al convertir el json al las clases algunos nombres de las variables no coincidan y por eso se usa
        la anotacion @SerializedName para ajustar los nombres, pero este puede traer problemas al cambiar de api que use otro nombre en sus variables
     */
    @SerializedName("Title")
    String nombre;
    @SerializedName("Year")
    int fechaDeLanzamiento;
    int duracionMinutos;
    boolean incluidoEnELPlan;
    private double sumaEvaluaciones;
    private int totalDeEvaluaciones;

    public Titulo(String nombre, int fechaDeLanzamiento) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public boolean isIncluidoEnELPlan() {
        return incluidoEnELPlan;
    }

    public void setIncluidoEnELPlan(boolean incluidoEnELPlan) {
        this.incluidoEnELPlan = incluidoEnELPlan;
    }


    public void mostrarFichaTecnica() {
        System.out.println("Mi pelicula es: " + nombre);
        System.out.println("Su fecha de lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("Su duracion es: " + duracionMinutos);
        // System.out.println("La calificacion para esta pelicula es: "+ sumaEvaluaciones/ totalDeEvaluaciones)
    }

    public void evalua(double nota) {
        sumaEvaluaciones += nota;
        totalDeEvaluaciones++;
//        sumaEvaluaciones = sumaEvaluaciones + nota;
    }

    public double calcularMedia() {
        return sumaEvaluaciones / totalDeEvaluaciones;
    }

    public int getTotalDeEvaluaciones() {
        return totalDeEvaluaciones;
    }


    @Override
    public int compareTo(Titulo titulo) {
        return this.getNombre().compareTo(titulo.getNombre());
    }

    @Override
    public String toString() {
        return
                "nombre='" + nombre + '\'' +
                ", fechaDeLanzamiento=" + fechaDeLanzamiento ;
    }
}
