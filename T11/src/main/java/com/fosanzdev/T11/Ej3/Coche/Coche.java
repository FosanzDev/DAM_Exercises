package com.fosanzdev.T11.Ej3.Coche;

public abstract class Coche {

    public final String matricula;
    public double velocidad;
    public int marcha;
    public int[] marchas;

    public Coche(String matricula, int[] marchas) throws IllegalArgumentException{
        for (int m : marchas){
            if (m < 0){
                throw new IllegalArgumentException("Las velocidades no pueden ser negativas");
            }
        }
        this.matricula = matricula;
        this.marchas = marchas;
        this.velocidad = 0;
        this.marcha = 0;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public int getMarcha() {
        return marcha;
    }

    /**
     * Actualiza la marcha del coche en función de la velocidad
     */
    protected abstract void cambiarMarcha(int marcha);

    /**
     * Aumenta la velocidad del coche en la cantidad indicada
     * @param vel Velocidad que se tiene que aumentar
     */
    public void acelerar(double vel){
        double velocidadObjetivo = this.velocidad + vel;
        if (velocidadObjetivo > marchas[marcha]) {
            velocidad = marchas[marcha];
            incrementarResto(velocidadObjetivo - velocidad);
        } else {
            this.velocidad += vel;
        }
    }

    protected abstract void incrementarResto(double resto);

    /**
     * Reduce la velocidad del coche en la cantidad indicada
     * @param vel Velocidad que se tiene que reducir
     */
    public void frenar(double vel){
        this.velocidad -= vel;
        if (this.velocidad < 0){
            this.velocidad = 0;
        }
    }

    /**
     * Frena el coche hasta pararlo
     */
    public void frenar(){
        this.velocidad = 0;
    }

    @Override
    public String toString() {
        return "Coche:\n" +
                "\tMatrícula: " + matricula + "\n" +
                "\tVelocidad: " + velocidad + "\n" +
                "\tMarcha: " + marcha + "\n";
    }
}
