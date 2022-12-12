package Animales;

public class Gato extends Animal{
    public Gato(String raza) {
        super(raza);
    }

    // Variables de instancia/ATRIBUTOS
    private String apodo;

    // Metodos
    @Override
    public void hacerSonido(){
        System.out.println("Miau miau!");
    }
    public void ponerApodo(String apodo){
        this.apodo = apodo;
    }

    public String getApodo() {
        return apodo;
    }

}

