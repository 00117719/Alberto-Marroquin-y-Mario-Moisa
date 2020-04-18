package com.AJMM.x00117719;

public class Documento extends Empleado {
    private String nombre;
    private String numero;

    public Documento(String nombre, String puesto, String nombre1, String numero) {
        super(nombre, puesto);
        this.nombre = nombre1;
        this.numero= numero;
    }



    }