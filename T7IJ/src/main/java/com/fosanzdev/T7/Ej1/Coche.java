package com.fosanzdev.T7.Ej1;

public class Coche {


    public enum TipoCoche {
        MINI, UTILITARIO, FAMILIAR, DEPORTIVO
    }

    public enum ModalidadSeguro {
        TODO_RIESGO, TERCEROS
    }

    private String modelo;
    private String color;
    private boolean metalizado;
    private String matricula;
    private TipoCoche tipoCoche;
    private int anyoFabricacion;
    private ModalidadSeguro modalidadSeguro;

    public Coche(String modelo, String color, boolean metalizado, String matricula, TipoCoche tipoCoche, int anyoFabricacion, ModalidadSeguro modalidadSeguro) {
        this.modelo = modelo;
        this.color = color;
        this.metalizado = metalizado;
        this.matricula = matricula;
        this.tipoCoche = tipoCoche;
        this.anyoFabricacion = anyoFabricacion;
        this.modalidadSeguro = modalidadSeguro;
    }

    public Coche() {
        this.modelo = "Unknown";
        this.color = "#FFFFFF";
        this.metalizado = false;
        this.tipoCoche = TipoCoche.UTILITARIO;
        this.matricula = "0000AAA";
        this.anyoFabricacion = 0;
        this.modalidadSeguro = ModalidadSeguro.TERCEROS;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isMetalizado() {
        return metalizado;
    }

    public void setMetalizado(boolean metalizado) {
        this.metalizado = metalizado;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public TipoCoche getTipoCoche() {
        return tipoCoche;
    }

    public void setTipoCoche(TipoCoche tipoCoche) {
        this.tipoCoche = tipoCoche;
    }

    public int getAnyoFabricacion() {
        return anyoFabricacion;
    }

    public void setAnyoFabricacion(int anyoFabricacion) {
        this.anyoFabricacion = anyoFabricacion;
    }

    public ModalidadSeguro getModalidadSeguro() {
        return modalidadSeguro;
    }

    public void setModalidadSeguro(ModalidadSeguro modalidadSeguro) {
        this.modalidadSeguro = modalidadSeguro;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", metalizado=" + metalizado +
                ", matricula='" + matricula + '\'' +
                ", tipoCoche=" + tipoCoche +
                ", anyoFabricacion=" + anyoFabricacion +
                ", modalidadSeguro=" + modalidadSeguro +
                '}';
    }

}

