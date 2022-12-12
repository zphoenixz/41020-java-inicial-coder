package Clases;

import interfaces.Botones;

public class ControlRemotoLG implements Botones {

    @Override
    public void ajustarVolumen(int intesidad) {

    }

    @Override
    public String cambiarCanal(int numero) {
        return null;
    }

    @Override
    public boolean cambiarEstadoDeEncendido(boolean nuevoEstado) {
        return false;
    }
}
