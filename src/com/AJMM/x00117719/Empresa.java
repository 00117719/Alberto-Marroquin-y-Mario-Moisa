package com.AJMM.x00117719;
import java.util.ArrayList;
import java.util.List;

public class Empresa extends Empleado {
    private String nombre;
    private List<Empleado> planilla= new ArrayList<>();

    public Empresa(String nombre, String puesto, String nombre1) {
        super(nombre, puesto);
        this.nombre = nombre1;
    }
}
