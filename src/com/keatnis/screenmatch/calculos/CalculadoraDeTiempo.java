package com.keatnis.screenmatch.calculos;

import com.keatnis.screenmatch.mod.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public void incluye(Titulo titulo) {
        this.tiempoTotal += titulo.getDuracionMinutos();

    }

    public int getTiempoTotal() {
        return tiempoTotal;
    }
}
