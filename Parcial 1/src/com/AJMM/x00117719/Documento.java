package com.AJMM.x00117719;

public class Documento {
    private String nombre;
    private String numero;

    public Documento(String nombre, String numero) {
        this.nombre = nombre;
        this.numero= numero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "nombre='" + nombre + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
}
