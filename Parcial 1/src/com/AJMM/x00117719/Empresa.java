package com.AJMM.x00117719;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private List<Empleado> planilla;

    public Empresa(String nombre) {
        this.nombre = nombre;
        planilla= new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Empresa(List<Empleado> planilla) {
        this.planilla = planilla;
    }
    public void addEmpleado(Empleado empleado){
        planilla.add(empleado);
    }

 public void quitEmpleado(String nombre){

 }
}
