package Abstractas;

public abstract class Grafico {
    int x,y ;
    public Grafico(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void moverA(int x, int y){
        System.out.println("x:"+x);
    }
    protected abstract void dibujar();
    protected abstract void cambiarTamanio();
}

