public class Calculadora {
    public final static double PI = 3.1416;

    private int numero1;
    private int numero2;

    //Metodo constructor
    public Calculadora(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public void resta() {
        //Los 3 son exactamente igual
        int resultad1 = numero1 - numero2;
        int resultado2 = this.numero1 - this.numero2;
        int resultado3 = getNumero1() - getNumero2();
        System.out.println(resultad1);
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
}
