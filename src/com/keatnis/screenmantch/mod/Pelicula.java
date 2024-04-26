package com.keatnis.screenmantch.mod;

public class Pelicula {
    String nombre;
    int fechaDeLanzamiento;
    int duracionMinutos;
    boolean incluidoEnELPlan;
    private double sumaEvaluaciones;
    private int totalDeEvaluaciones;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public void setIncluidoEnELPlan(boolean incluidoEnELPlan) {
        this.incluidoEnELPlan = incluidoEnELPlan;
    }

    public void muestraFichaTecnica() {
        System.out.println("Mi pelicula es: " + nombre);
        System.out.println("Su fecha de lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("Su duracion es: " + duracionMinutos);
       // System.out.println("La calificacion para esta pelicula es: "+ sumaEvaluaciones/ totalDeEvaluaciones);

    }

   public void evalua(double nota) {
        sumaEvaluaciones += nota;
        totalDeEvaluaciones++;
//        sumaEvaluaciones = sumaEvaluaciones + nota;
    }

    public double calcularMedia() {
        return sumaEvaluaciones / totalDeEvaluaciones;
    }
   public int getTotalDeEvaluaciones(){
    return totalDeEvaluaciones;
    }

}
