package org.quarkus.dtos;

import java.util.Objects;

public class Temperatura {

    private String ciudad;
    private int maxima;
    private int minima;

    public Temperatura() {
    }

    public Temperatura(String ciudad, int maxima, int minima) {
        this.ciudad = ciudad;
        this.maxima = maxima;
        this.minima = minima;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getMaxima() {
        return maxima;
    }

    public void setMaxima(int maxima) {
        this.maxima = maxima;
    }

    public int getMinima() {
        return minima;
    }

    public void setMinima(int minima) {
        this.minima = minima;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Temperatura that = (Temperatura) o;
        return maxima == that.maxima && minima == that.minima && Objects.equals(ciudad, that.ciudad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ciudad, maxima, minima);
    }

    @Override
    public String toString() {
        return "Temperatura{" +
                "ciudad='" + ciudad + '\'' +
                ", maxima=" + maxima +
                ", minima=" + minima +
                '}';
    }
}
