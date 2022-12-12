package Clases;

import interfaces.Botones;

public class ControlRemotoHisense implements Botones {
    public ControlRemotoHisense() {
    }

    @Override
    public void ajustarVolumen(int intesidad) {
        System.out.println("El volumen subi a: "+ (intesidad*2));
    }

    @Override
    public String cambiarCanal(int numero) {
        if(numero == 10){
            return "canal chino1";
        }else if(numero == 12){
            return "canal chino2";
        }
        return "ruido de fondo";
    }

    @Override
    public boolean cambiarEstadoDeEncendido(boolean nuevoEstado) {
        return !nuevoEstado;
    }
}
