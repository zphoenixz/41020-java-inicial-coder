package Animales;

public class Animal {
    private int tamanio;
    private String nombre;
    private String raza;

    public Animal(String raza) {
        this.raza = raza;
    }

    public void hacerSonido(){
        System.out.println("Sonido!!!!");
    }

    public void correr(){
        System.out.println("Corre y se cae");
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
