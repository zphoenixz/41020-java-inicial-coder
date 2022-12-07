package Clases;

import interfaces.Botones;

public class ControlRemotoSony implements Botones {
    public ControlRemotoSony() {
    }

    @Override
    public void ajustarVolumen(int intesidad) {
        System.out.println("El volumen subi a: "+ intesidad);
    }

    @Override
    public String cambiarCanal(int numero) {
        if(numero == 10){
            return "telefe";
        }else if(numero == 12){
            return "trece";
        }
        return "ruido de fondo";
    }

    @Override
    public boolean cambiarEstadoDeEncendido(boolean nuevoEstado) {
        return !nuevoEstado;
    }
}
