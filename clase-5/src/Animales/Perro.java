package Animales;

import java.util.Objects;

public class Perro extends Animal{
    public Perro(String raza) {
        super(raza);
    }

    // Variables de instancia/ATRIBUTOS
    private String apodo;

    @Override
    public void hacerSonido(){
        System.out.println("Wau wau!");
    }

    // Metodos
//    public void ladrar(){
//        System.out.println("Ladrido de perro");
//    }
//    public void correr(){
//        System.out.println("Corre y se cae");
//    }
    public void ponerApodo(String apodo){
        this.apodo = apodo;
    }

    // Agregar los getter and setters

    public String getApodo() {
        return apodo;
    }

//    public int getTamanio() {
//        return tamanio;
//    }
//
//    public String getNombre() {
//        return nombre;
//    }
//
//    public String getRaza() {
//        return raza;
//    }
//
//    public void setTamanio(int tamanio) {
//        this.tamanio = tamanio;
//    }
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }

//    public void setRaza(String raza) {
//        this.raza = raza;
//    }

}

