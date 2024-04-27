package com.keatnis.screenmatch.mod;

import com.keatnis.screenmatch.calculos.Clasificacion;

public class Titulo implements Clasificacion {

    String nombre;
    int fechaDeLanzamiento;
    int duracionMinutos;
    boolean incluidoEnELPlan;
    private double sumaEvaluaciones;
    private int totalDeEvaluaciones;

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
    public int getClasificacion() {
        return (int) calcularMedia()/2;
    }

}
