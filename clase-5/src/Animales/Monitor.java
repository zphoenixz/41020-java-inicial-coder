package Animales;

import java.util.Objects;

public class Monitor {

    int altura;
    int ancho;


    public Monitor() {
    }

    public Monitor(int altura) {
        this.altura = altura;
    }

    public Monitor(int altura, int ancho) {
        this.altura = altura;
        this.ancho = ancho;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monitor monitor)) return false;
        return altura == monitor.altura && ancho == monitor.ancho;
    }

    @Override
    public int hashCode() {
        return Objects.hash(altura, ancho);
    }
    //hash 1->+5-2*2->6
    //hash 2->+5-2*2->10
}
