package com.keatnis.screenmatch.calculos;

public class FiltroRecomendacion {
    public void filtra (Clasificacion clasificacion) {
        if (clasificacion.getClasificacion() >= 4) {
            System.out.println("Super recomendable en el momento");
        }else if (clasificacion.getClasificacion() >=2){
            System.out.println("No esta tan mal, regular");
        }else{
            System.out.println("Puedes verlo despues");
        }
    }
}
