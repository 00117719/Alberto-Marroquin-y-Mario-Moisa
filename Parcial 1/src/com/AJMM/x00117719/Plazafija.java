package com.AJMM.x00117719;

import java.util.List;

public class Plazafija extends Empleado {

    private int extension;

    public Plazafija(String nombre, String puesto, double salario, int extension) {
        super(nombre, puesto, salario);
        this.extension = extension;
    }

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }
}
