package com.AJMM.x00117719;

import java.util.ArrayList;
import java.util.List;

public class Empleado {


    protected String nombre;
    protected String puesto;
    protected List<Documento> documentos= new ArrayList<>();
    protected double salario;


    public Empleado(String nombre,String puesto) {
        this.nombre = nombre;
        this.puesto= puesto;
    }

    public Empleado() {

    }

    public String getNombre() {
        return nombre;
    }
    public String getPuesto(){
        return puesto;
    }

    public List<Documento> getDocumentos() {
        return documentos;
    }


    public void addDocumento(List<Documento> documento){


    }

    public void removeDocumento(String doc){


    }



    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}
