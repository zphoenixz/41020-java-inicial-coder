package Animales;

public class Delfin extends Animal{
    public Delfin(String raza) {
        super(raza);
    }

    // Variables de instancia/ATRIBUTOS
    private String apodo;
    private String tipoDeAgua;//aguadulce salada

    public void ponerApodo(String apodo){
        this.apodo = apodo;
    }

    @Override
    public void hacerSonido(){
        System.out.println("titrirtiritr!");
    }

    // Agregar los getter and setters

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getTipoDeAgua() {
        return tipoDeAgua;
    }

    public void setTipoDeAgua(String tipoDeAgua) {
        this.tipoDeAgua = tipoDeAgua;
    }
}

