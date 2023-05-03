package com.fosanzdev.T11.Ej3.Coche;

public class CocheCambioAutomatico extends Coche{

    public CocheCambioAutomatico(String matricula, int[] marchas) throws IllegalArgumentException{
        super(matricula, marchas);
    }

    /**
     * Cambia la marcha a la marcha indicada
     * @param marcha marcha indicada
     */
    @Override
    protected void cambiarMarcha(int marcha) {
        this.marcha = marcha;
    }

    /**
     * Calcula la marcha a la que el coche debe ir
     * en funcion de su velocidad
     */
    private void updateMarcha(){
        for (int i = 0; i < marchas.length; i++){
            if (velocidad < marchas[i]){
                cambiarMarcha(i);
                break;
            }
        }
    }

    /**
     * Aumenta la velocidad en la cantidad indicada y calcula
     * la marcha a la que el coche debe cambiar
     * @param vel Velocidad que se tiene que aumentar
     */
    @Override
    public void acelerar(double vel){
        super.acelerar(vel);
        updateMarcha();
    }

    @Override
    protected void incrementarResto(double resto) {

    }

    /**
     * Reduce la velocidad en la cantidad indicada y calcula
     * la marcha a la que el coche debe cambiar
     * @param vel Velocidad que se tiene que reducir
     */
    @Override
    public void frenar(double vel){
        super.frenar(vel);
        updateMarcha();
    }

    /**
     * Frena el coche completamente y cambia a marcha neutra
     */
    @Override
    public void frenar(){
        super.frenar();
        cambiarMarcha(0);
    }
}